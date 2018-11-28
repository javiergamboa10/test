package com.test_gamboa.TestService.controller;

import com.test_gamboa.TestService.model.NonDivisibleInput;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NonDivisibleControllerTest {

    private NonDivisibleController Controller;

    @Before
    public void setUp() throws Exception {
        this.Controller = new NonDivisibleController();
    }

    @Test
    public void getSubsetLengthFor4() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(4);
        NonDivisibleInput pInput = new NonDivisibleInput(4, 3, list);
        assertEquals(3, this.Controller.getSubsetLength(pInput));
    }

    @Test
    public void getSubsetLengthFor10() {
        List<Integer> list = new ArrayList<>();
        list.add(2375782);
        list.add(21836421);
        list.add(2139842193);
        list.add(2138723);
        list.add(23816);
        list.add(21836219);
        list.add(2948784);
        list.add(43864923);
        list.add(283648327);
        list.add(23874673);
        NonDivisibleInput pInput = new NonDivisibleInput(10, 13, list);
        assertEquals(7, this.Controller.getSubsetLength(pInput));
    }

}