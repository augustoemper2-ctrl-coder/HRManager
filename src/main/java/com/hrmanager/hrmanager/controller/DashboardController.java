package com.hrmanager.hrmanager.controller;

import com.hrmanager.hrmanager.entity.Empresa;
import com.hrmanager.hrmanager.repository.EmpresaRepository;
import com.hrmanager.hrmanager.repository.EmpleadoRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    private final EmpresaRepository empresaRepository;
    private final EmpleadoRepository empleadoRepository;

    public DashboardController(EmpresaRepository empresaRepository,
                               EmpleadoRepository empleadoRepository) {
        this.empresaRepository = empresaRepository;
        this.empleadoRepository = empleadoRepository;
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {

        Empresa empresa = empresaRepository.findAll().stream().findFirst().orElse(null);

        long totalEmpresas = empresaRepository.count();
        long totalEmpleados = empleadoRepository.count();

        model.addAttribute("empresa", empresa);
        model.addAttribute("totalEmpresas", totalEmpresas);
        model.addAttribute("totalEmpleados", totalEmpleados);

        return "dashboard";
    }
}