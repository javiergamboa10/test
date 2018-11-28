package com.test_gamboa.TestService.controller;

import com.test_gamboa.TestService.model.SherlockInput;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(value = "sherlock-strings", description = "Controlador Sherlock")
@RestController
public class SherlockController {

    private String CheckString(String pInput) {
        final String isValid = "YES";
        final String isNotValid = "NO";
        LetterController letters = new LetterController(pInput);
        if (letters.HasEqualCount() || (letters.CanChangeOnlyOneElement()))
            return isValid;
        else
            return isNotValid;
    }

    @ApiOperation(value = "Servicio usado por Sherlock para considerar una cadena válida")
    @RequestMapping(path = "/sherlock-strings", method = RequestMethod.POST)
    public String IsValidString(@Valid @RequestBody SherlockInput s) {
        return CheckString(s.getS());
    }
}
