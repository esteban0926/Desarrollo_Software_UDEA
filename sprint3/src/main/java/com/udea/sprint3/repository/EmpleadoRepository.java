package com.udea.sprint3.repository;

import com.udea.sprint3.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

}
