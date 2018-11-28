package com.test_gamboa.TestService.controller;

import com.test_gamboa.TestService.model.NonDivisibleInput;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(value = "non-divisible-subsets", description = "Controlador Subconjuntos")
@RestController
public class NonDivisibleController {

    @ApiOperation(value = "Servicio usado para determinar los subconjuntos no divisibles")
    @RequestMapping(path = "/non-divisible-subsets", method = RequestMethod.POST)
    public int getSubsetLength(@Valid @RequestBody NonDivisibleInput input) {
        SubsetController controller = new SubsetController(input);
        return controller.getMaxSubsetLength();
    }
}
