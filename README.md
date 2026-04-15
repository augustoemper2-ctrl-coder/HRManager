# HRManager

Sistema de Gestión de Recursos Humanos desarrollado como proyecto de formación en el programa de Análisis y Desarrollo de Software del SENA.

El objetivo del sistema es digitalizar la gestión de talento humano en empresas colombianas.

## Descripción

HRManager es una plataforma web diseñada para digitalizar y automatizar los procesos de gestión de talento humano dentro de las empresas, eliminando el uso de papel y mejorando la eficiencia administrativa.

El sistema permite gestionar:

- Autenticación   
- Registro de empresa (Onboarding)    
- Dashboard administrativo    
- Gestión de empleados    
  - Nómina:    
      * cálculo de salario   
      * deducciones   
      * desprendible de pago   

  - Control de asistencia:    
      * registro de entrada/salida   
      * horas extras   
      * reportes   

  - Evaluación de desempeño:    
      * evaluaciones por empleado   
      * métricas  

  - Vacantes:    
      * empleados por área   
      * vacantes abiertas   
      * candidatos en proceso
  
  - Reclutamiento    
      * Carga de hojas de vida (CV)   
      * subir archivos PDF   
      * base de candidatos  

  - Trabaja con nosotros    


## Tecnologías utilizadas:

  * Backend:    
      - Spring Boot    
      - Spring Security    
      - JPA / Hibernate    
      - MySQL    

  * Arquitectura:    
      - controller    
      - entity   
      - repository   
      - seguridad   

  * Frontend:    
      - Thymeleaf   
      - Bootstrap   

  * DevOps básico:   
      - Git    
      - GitHub    

## Estructura del proyecto

HRManager   
│    
├── pom.xml   
├── mvnw   
├── src   
│   ├── controller   
│   ├── entity   
│   ├── repository   
│   ├── seguridad   
│    
├── templates   
│   ├── login.html   
│   ├── dashboard.html   
│   ├── empleados.html   
│    
└── docs   
    └── HRManager_Politica_Tratamiento_Datos_EMPRESARIAL.pdf   
  
## Seguridad y Protección de Datos:

El sistema implementa principios de seguridad para el manejo de la información personal de los empleados conforme a la normativa colombiana de protección de datos.

Se incluye una política de tratamiento de datos dentro de la carpeta **docs**.

## Autor

César Augusto Peña 
Estudiante de Tecnología Análisis y Desarrollo de Software
Proyecto académico - SENA
