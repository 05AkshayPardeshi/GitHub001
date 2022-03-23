package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ApplicationController {

    @GetMapping
    public String m1() {
        return "WELCOM TO GITHUB PROGRAMING ";
    }

    @GetMapping("/name")
    public String m2() {
        return "AKSHAY PARDESHI..!";
    }

}
