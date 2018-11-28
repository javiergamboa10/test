package com.test_gamboa.TestService.model;

public class Letter {

    private byte Code;

    private int Count;

    public int getCount() {
        return Count;
    }

    public byte getCode() {
        return Code;
    }

    public void IncCount() {
        this.Count++;
    }

    public Letter(byte pCode) {
        this.Code = pCode;
        this.Count = 1;
    }
}
