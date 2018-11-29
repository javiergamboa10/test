package com.test_gamboa.TestService.controller;

import com.test_gamboa.TestService.model.NonDivisibleInput;
import com.test_gamboa.TestService.model.Reminder;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubsetController {

    private NonDivisibleInput input;

    private Reminder findReminder(int pReminder, List<Reminder> reminders_tmp) {
        Iterator<Reminder> iterator = reminders_tmp.iterator();
        while (iterator.hasNext()) {
            Reminder rem_tmp = iterator.next();
            if (rem_tmp.getReminder() == pReminder) {
                return rem_tmp;
            }
        }
        return null;
    }

    public void removeLessUsed(List<Reminder> pResult, Reminder pLessUsed) {
        for (int i = 0; i < pResult.size(); i++)
            if ((pResult.get(i)).getReminder() == pLessUsed.getReminder())
                pResult.remove(i);
    }

    public int getMaxSubsetLength() {
        List<Reminder> reminders = new ArrayList<>();
        List<Reminder> result = new ArrayList<>();
        int cont = 0;
        if (this.input.getK() == 1)
            return 1;
        else {
            for (int i = 0; i < this.input.getS().size(); i++) {
                Reminder rem_tmp = findReminder(this.input.getS().get(i) % this.input.getK(), reminders);
                if (rem_tmp == null)
                    reminders.add(new Reminder(this.input.getS().get(i) % this.input.getK()));
                else
                    rem_tmp.IncCount();
            }
            result = reminders;
            for (int i = 0; i < reminders.size(); i++)
                for (int j = i + 1; j < reminders.size(); j++)
                    if (((reminders.get(i)).getReminder() + (reminders.get(j)).getReminder()) == this.input.getK())
                        removeLessUsed(result, ((reminders.get(i)).getCount() > (reminders.get(j)).getCount()) ? reminders.get(j) : reminders.get(i));
            for (int i = 0; i < result.size(); i++)
                cont = cont + (result.get(i)).getCount();
            return cont;
        }
    }

    public SubsetController(NonDivisibleInput input){
      this.input = input;
    }
}
