package com.test_gamboa.TestService.controller;

import com.test_gamboa.TestService.model.Letter;

import java.util.*;

public class LetterController {

    private List<Letter> letters = new ArrayList<>();

    private Letter findLetter(byte pCode, List<Letter> letters_tmp) {
        Iterator<Letter> iterator = letters_tmp.iterator();
        while (iterator.hasNext()) {
            Letter letter_tmp = iterator.next();
            if (letter_tmp.getCode() == pCode) {
                return letter_tmp;
            }
        }
        return null;
    }
    public LetterController(String pInput) {
        for (int i = 0; i <= pInput.length() - 1; i = i + 1) {
            Letter letter_tmp = findLetter((byte) pInput.charAt(i), letters);
            if (letter_tmp == null)
                letters.add(new Letter((byte) pInput.charAt(i)));
            else
                letter_tmp.IncCount();
        }
    }

    public boolean HasEqualCount() {
        Iterator<Letter> iterator = letters.iterator();
        int Count = (letters.get(0)).getCount();
        while (iterator.hasNext()) {
            if (Count != (iterator.next()).getCount())
                return false;
        }
        return true;
    }

    public boolean CanChangeOnlyOneElement() {

        Collections.sort(letters, new Comparator<Letter>() {
            @Override
            public int compare(Letter letter1, Letter letter2) {
                return letter1.getCount() - letter2.getCount();
            }
        });
        Iterator<Letter> iterator = letters.iterator();
        int changesCount = 0;
        int priorCount = (letters.get(0)).getCount();
        int currentCount;
        while (iterator.hasNext()) {
            currentCount =(iterator.next()).getCount();
            if (currentCount > priorCount) {
                if (currentCount > priorCount + 1)
                    return false;
                else
                    changesCount++;
            }
        }
        return (changesCount == 1);
   }
}
