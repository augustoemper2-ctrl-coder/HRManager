package com.hrmanager.hrmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReclutamientoController {

    @GetMapping("/reclutamiento")
    public String reclutamiento() {
        return "reclutamiento";
    }

}