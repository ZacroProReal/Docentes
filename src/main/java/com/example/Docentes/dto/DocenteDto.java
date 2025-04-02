package com.example.Docentes.dto;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record  DocenteDto (@NotBlank String nombre,
                           String tituloAcademico,
                           String telefono,String noIdentificacion, LocalDate fechaNacimiento
) {

}