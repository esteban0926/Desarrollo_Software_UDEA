package com.udea.sprint3.services;

import com.udea.sprint3.entity.Empresa;
import com.udea.sprint3.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public List<Empresa> getEmpresas(){
        return empresaRepository.findAll();
    }

    public Empresa getEmpresaById(Integer id){
        return empresaRepository.findById(id).orElse(null);

    }

//    Adicionar la empresa
    public Empresa saveEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public List<Empresa> saveEmpresas(List<Empresa> empresas){
        return empresaRepository.saveAll(empresas);
    }

    public Empresa updateEmpresa(Empresa empresa){
        Empresa existEmpresa = empresaRepository.findById(empresa.getId()).orElse(null);
        existEmpresa.setNombre(empresa.getNombre());
        existEmpresa.setDireccion(empresa.getDireccion());
        existEmpresa.setTelefono(empresa.getTelefono());
        existEmpresa.setNIT(empresa.getNIT());

        return empresaRepository.save(existEmpresa);
    }

    public String deleteEmpresa(Integer id){
        empresaRepository.deleteById(id) ;
        return "Se ha eliminado la empresa con el id: " + id;
    }

}
