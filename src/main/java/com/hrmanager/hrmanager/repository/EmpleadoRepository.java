package com.hrmanager.hrmanager.repository;

import com.hrmanager.hrmanager.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
