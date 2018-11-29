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

    @Test
    public void getSubsetLengthFor15() {
        List<Integer> list = new ArrayList<>();
        list.add(278);
        list.add(576);
        list.add(496);
        list.add(727);
        list.add(410);
        list.add(124);
        list.add(338);
        list.add(149);
        list.add(209);
        list.add(702);
        list.add(282);
        list.add(718);
        list.add(771);
        list.add(575);
        list.add(436);
        NonDivisibleInput pInput = new NonDivisibleInput(15, 7, list);
        assertEquals(11, this.Controller.getSubsetLength(pInput));
    }
}