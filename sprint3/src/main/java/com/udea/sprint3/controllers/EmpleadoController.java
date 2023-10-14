package com.udea.sprint3.controllers;

import com.udea.sprint3.entity.Empleado;
import com.udea.sprint3.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/empleados")
    public List<Empleado> findAllEmpleados(){
        return empleadoService.getEmpleado();
    }

    @GetMapping("/empleado/{id}")
    public Empleado findById(@PathVariable Integer id){
        return empleadoService.getEmpleadoById(id);
    }
    @PostMapping("/addEmpleado")
    public Empleado saveEmpleado(@RequestBody Empleado empleado){
        return empleadoService.saveEmpleado(empleado);
    }

    @PostMapping("/addEmpleados")
    public List<Empleado> saveEmpleados(@RequestBody List<Empleado> empleados){
        return empleadoService.saveEmpleados(empleados);
    }

    @PutMapping("/updateEmpleado")
    public Empleado updateEmpleado(@RequestBody Empleado empleado){
        return empleadoService.updateEmpleado(empleado);
    }

    public String deleteEmpleado(@PathVariable Integer id){
        return empleadoService.deleteEmpleado(id);
    }

}
