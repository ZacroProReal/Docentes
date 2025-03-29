package com.example.Docentes.servicios;

import com.example.Docentes.dto.DocenteDto;
import com.example.Docentes.entidades.Docentes;
import com.example.Docentes.repositorios.DocenteRepositorio;


import java.util.List;

public class DocenteServicio {

    DocenteRepositorio docenteRepositorio;

    public DocenteDto crear(DocenteDto docenteDto){
        Docentes equipo = Docentes.builder()
                .nombre(docenteDto.nombre())
                .tituloAcademico(docenteDto.tituloAcademico())
                .telefono(docenteDto.telefono())
                .noIdentificacion(docenteDto.noIdentificacion())
                .fechaNacimiento(docenteDto.fechaNacimiento())
                .build();

        if (docenteRepositorio.save(equipo).getId() > 0)
            return docenteDto;
        else return null;
    }
    public List<Docentes> obtenerTodos()
    {
        return docenteRepositorio.findAll();
    }
}
