package com.hrmanager.hrmanager.repository;

import com.hrmanager.hrmanager.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Método para buscar usuario por email (para login)
    Usuario findByEmail(String email);
}
