package com.test_gamboa.TestService.controller;

import com.test_gamboa.TestService.model.SherlockInput;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class SherlockControllerTest {

    private SherlockController Controller;

    @Before
    public void setUp() {
        this.Controller = new SherlockController();
    }

    @Test
    public void StringWithEqualQty() {
        String input = "abcabc";
        SherlockInput pInput = new SherlockInput(input);
        assertEquals("YES", this.Controller.IsValidString(pInput));
    }

    @Test
    public void StringWithOneChangeOnly() {
        String input = "abcdefghhgfedecba";
        SherlockInput pInput = new SherlockInput(input);
        assertEquals("YES", this.Controller.IsValidString(pInput));
    }

    @Test
    public void StringWithTwoChanges() {
        String input = "abcabcabccb";
        SherlockInput pInput = new SherlockInput(input);
        assertEquals("NO", this.Controller.IsValidString(pInput));
    }

    @Test
    public void RandomString() {
        String input = "ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiie";
        SherlockInput pInput = new SherlockInput(input);
        assertEquals("NO", this.Controller.IsValidString(pInput));
    }

}