package com.udea.sprint3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String correo;
    @Column
    private String rol;
    @Column
    private boolean estado; //para saber si esta activo o no



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String toString(){
        return "Empleado: {" + "id: " + id + ", nombre: " + nombre + ", correo: " + correo + ", rol: " + rol + "estado: " + estado + '}';
    }
        
}
