package com.udea.sprint3.services;

import com.udea.sprint3.entity.Empleado;
import com.udea.sprint3.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> getEmpleado(){
        return empleadoRepository.findAll();
    }

    public Empleado getEmpleadoById(Integer id){
        return empleadoRepository.findById(id).orElse(null);
    }

//    Adicionar Empleado
public Empleado saveEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
}

public List<Empleado> saveEmpleados(List<Empleado> empleados){
        return empleadoRepository.saveAll(empleados);
}

public Empleado updateEmpleado(Empleado empleado){
        Empleado existEmpleado = empleadoRepository.findById(empleado.getId()).orElse(null);
        existEmpleado.setNombre(empleado.getNombre());
        existEmpleado.setCorreo(empleado.getCorreo());
        existEmpleado.setRol(empleado.getRol());
        existEmpleado.setEstado(empleado.isEstado());

        return empleadoRepository.save(existEmpleado);
    }

    public String deleteEmpleado(Integer id){
        empleadoRepository.deleteById(id);
        return "El empleado con el id: " + id  + " ha sido eliminado";
    }

}
