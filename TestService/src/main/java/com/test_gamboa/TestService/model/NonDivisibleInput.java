package com.test_gamboa.TestService.model;

import java.util.List;

public class NonDivisibleInput {
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private int n;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    private int k;

    public List<Integer> getS() {
        return S;
    }

    public void setS(List<Integer> s) {
        S = s;
    }

    private List<Integer> S;

    public NonDivisibleInput() {
    }

    public NonDivisibleInput(int n, int k, List<Integer> S) {
      this.n = n;
      this.k = k;
      this.S = S;
    }

}
