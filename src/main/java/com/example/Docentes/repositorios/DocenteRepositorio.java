package com.example.Docentes.repositorios;

import com.example.Docentes.entidades.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface DocenteRepositorio extends JpaRepository<Docente, Long>{
        @Query(value = """
                SELECT e FROM Docente e
                WHERE UPPER(e.nombre) = UPPER(?1)""")
        Docente findByNombre (String nombre);
        Docente findByTituloAcademico (String tituloAcademico);
        Docente findBynoIdentificacion (String  noIdentificacion);
        Docente findByTelefono(String Telefono);
        Docente findByFechaNacimiento (LocalDate fechaNacimiento);
}
