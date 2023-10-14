package com.udea.sprint3.controllers;

import com.udea.sprint3.entity.Empresa;
import com.udea.sprint3.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/empresas")
    public List<Empresa> findAllEmpresas(){
        return empresaService.getEmpresas();
    }
    @GetMapping("/empresa/{id}")
    public Empresa findById(@PathVariable Integer id){
        return empresaService.getEmpresaById(id);
    }

    @PostMapping("/addEmpresa")
    public Empresa saveEmpresa(@RequestBody Empresa empresa){
        return empresaService.saveEmpresa(empresa);
    }


    @PutMapping("/updateEmpresa")
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping("/deleteEmpresa/{id}")
    public String deleteEmpresa(@PathVariable Integer id){
        return empresaService.deleteEmpresa(id);
    }

}
