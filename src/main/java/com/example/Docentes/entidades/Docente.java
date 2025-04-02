package com.example.Docentes.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table (name = "docentes")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String nombre;
    private String tituloAcademico;
    private String telefono;
    private String noIdentificacion;
    private LocalDate fechaNacimiento;

}
