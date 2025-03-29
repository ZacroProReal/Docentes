package com.example.Docentes.repositorios;

import com.example.Docentes.entidades.Docentes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface DocenteRepositorio extends JpaRepository<Docentes, Long>{
        @Query(value = """
                SELECT e FROM Docente e
                WHERE UPPER(e.nombre) = UPPER(?1)""")
        Docentes findByNombre (String nombre);
        Docentes findByTituloAcademico (String tituloAcademico, int  noIdentificacion);
        Docentes findByIdentificacion (int  noIdentificacion);
        Docentes findByFechaNacimiento (LocalDateTime fechaNacimiento);
}
