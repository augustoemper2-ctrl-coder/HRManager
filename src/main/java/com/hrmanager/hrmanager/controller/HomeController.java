package com.hrmanager.hrmanager.controller;

import com.hrmanager.hrmanager.repository.EmpresaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final EmpresaRepository empresaRepository;

    public HomeController(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    @GetMapping("/")
    public String inicio() {

        // verificar si ya existe empresa registrada
        if (empresaRepository.count() == 0) {
            return "redirect:/empresa/nuevo";
        }

        return "redirect:/dashboard";
    }
}