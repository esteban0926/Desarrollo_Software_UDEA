package com.udea.sprint3.repository;

import com.udea.sprint3.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}
