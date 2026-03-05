package com.hrmanager.hrmanager.test;

import com.hrmanager.hrmanager.entity.Empresa;
import com.hrmanager.hrmanager.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestEmpresaRepository implements CommandLineRunner {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public void run(String... args) throws Exception {
        // Crear una empresa de prueba
        Empresa e = new Empresa("Empresa Prueba", "logo.png", "Nuestro lema");
        empresaRepository.save(e);

        // Consultar todas las empresas
        System.out.println("Empresas en la DB:");
        empresaRepository.findAll().forEach(emp ->
                System.out.println(emp.getId() + " - " + emp.getNombre())
        );
    }
}
