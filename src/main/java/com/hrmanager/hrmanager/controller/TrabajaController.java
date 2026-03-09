package com.hrmanager.hrmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrabajaController {

    @GetMapping("/trabaja")
    public String trabaja() {
        return "trabaja";
    }

}