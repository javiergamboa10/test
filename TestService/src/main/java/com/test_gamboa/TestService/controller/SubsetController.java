package com.test_gamboa.TestService.controller;

import com.test_gamboa.TestService.model.NonDivisibleInput;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class SubsetController {

    private NonDivisibleInput input;

    private int getLessUsed(List<Integer> pResult, int i, int j) {
        int a = 0;
        int b = 0;
        for (int k = 0; k < pResult.size(); k++)
            if (pResult.get(k) == i)
                a++;
        for (int k = 0; k < pResult.size(); k++)
            if (pResult.get(k) == j)
                b++;
        if (a >= b)
            return j;
        else
            return i;
    }

    public void removeLessUsed(List<Integer> pResult, int pLessUsed) {
        for (int i = 0; i < pResult.size(); i++)
            if (pResult.get(i) == pLessUsed)
                pResult.remove(i);
    }

    public int getMaxSubsetLength() {
        List<Integer> reminders = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        if (this.input.getK() == 1)
            return 0;
        else {
            for (int i = 0; i < this.input.getS().size(); i++)
                reminders.add(this.input.getS().get(i) % this.input.getK());
            result = reminders;
            for (int i = 0; i < reminders.size(); i++)
                for (int j = i + 1; j < reminders.size(); j++)
                    if ((reminders.get(i) + reminders.get(j)) == this.input.getK())
                        removeLessUsed(result, getLessUsed(result, reminders.get(i), reminders.get(j)));
            return result.size();
        }
    }

    public SubsetController(NonDivisibleInput input){
      this.input = input;
    }
}
