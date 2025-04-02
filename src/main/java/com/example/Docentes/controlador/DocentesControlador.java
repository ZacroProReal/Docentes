package com.example.Docentes.controlador;
import com.example.Docentes.dto.DocenteDto;
import com.example.Docentes.servicios.DocenteServicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@RequestMapping("/docentes")
@CrossOrigin(origins = "*")

public class DocentesControlador {
    DocenteServicio docenteServicio;
    @PostMapping("/")
    public DocenteDto crear(@RequestBody DocenteDto docente){
        return docenteServicio.crear(docente);
    }

}
