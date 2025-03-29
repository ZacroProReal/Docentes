package com.example.Docentes.entidades;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table (name = "docente")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Docentes {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id;
    @Column(unique = true)
    private String nombre;
    private String tituloAcademico;
    private int telefono;
    private String noIdentificacion;
    private LocalDateTime fechaNacimiento;

}
