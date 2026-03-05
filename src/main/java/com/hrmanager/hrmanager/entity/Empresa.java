package com.hrmanager.hrmanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

    @Entity
    @Table(name = "empresa")
    public class Empresa {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;
        private String logoUrl;
        private String lema;

        // Constructor vacío obligatorio
        public Empresa() {}

        // Constructor con parámetros (opcional)
        public Empresa(String nombre, String logoUrl, String lema) {
            this.nombre = nombre;
            this.logoUrl = logoUrl;
            this.lema = lema;
        }

        // Getters y Setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getLogoUrl() {
            return logoUrl;
        }

        public void setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
        }

        public String getLema() {
            return lema;
        }

        public void setLema(String lema) {
            this.lema = lema;
        }
    }

