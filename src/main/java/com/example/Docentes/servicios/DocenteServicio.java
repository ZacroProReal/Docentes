package com.example.Docentes.servicios;

import com.example.Docentes.dto.DocenteDto;
import com.example.Docentes.entidades.Docente;
import com.example.Docentes.repositorios.DocenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServicio {

    DocenteRepositorio docenteRepositorio;

    @Autowired
    public DocenteServicio(DocenteRepositorio docenteRepositorio) {
        this.docenteRepositorio = docenteRepositorio;
    }
    public DocenteDto crear(DocenteDto docenteDto) {
        Docente docentes = Docente.builder()
                .nombre(docenteDto.nombre())
                .tituloAcademico(docenteDto.tituloAcademico())
                .telefono(docenteDto.telefono())
                .noIdentificacion(docenteDto.noIdentificacion())
                .fechaNacimiento(docenteDto.fechaNacimiento())
                .build();

        if (docenteRepositorio.save(docentes).getId() > 0)
            return docenteDto;
        else return null;
    }
    public List<Docente> obtenerTodos()
    {
        return docenteRepositorio.findAll();
    }
}

