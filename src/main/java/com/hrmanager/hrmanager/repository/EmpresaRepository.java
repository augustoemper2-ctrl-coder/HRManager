package com.hrmanager.hrmanager.repository;

import com.hrmanager.hrmanager.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    // Aquí podemos agregar consultas personalizadas más adelante
}
