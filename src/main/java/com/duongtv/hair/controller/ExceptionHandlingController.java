package com.duongtv.hair.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlingController {
    @ExceptionHandler(Exception.class)
    public String logErrorMessage(Exception e, Model model) {
        model.addAttribute("messsage","Loi gi do ");
     return "error";
    }
}
