package com.toronto.dinesafe;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EstablishmentNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(EstablishmentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(EstablishmentNotFoundException ex) {
        return ex.getMessage();
    }
}
