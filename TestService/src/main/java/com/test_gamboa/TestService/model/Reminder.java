package com.test_gamboa.TestService.model;

public class Reminder {
    public int getReminder() {
        return reminder;
    }

    public void setReminder(int reminder) {
        this.reminder = reminder;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void IncCount() {
        this.count++;
    }

    private int reminder;
    private int count;

    public Reminder(int pReminder) {
        this.reminder = pReminder;
        this.count = 1;
    }
}
