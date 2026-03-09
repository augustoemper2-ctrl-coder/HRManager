package com.hrmanager.hrmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VacanteController {

    @GetMapping("/vacantes")
    public String vacantes() {
        return "vacantes";
    }

}