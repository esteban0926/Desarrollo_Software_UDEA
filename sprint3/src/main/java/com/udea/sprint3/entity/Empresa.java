package com.udea.sprint3.entity;

import jakarta.persistence.*;

@Entity
@Table(name="empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private String telefono;
    @Column
    private String NIT;

    @Column
    private long movimiento;

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public long getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(long movimiento) {
        this.movimiento = movimiento;
    }

    public String toString (){
        return "Empresa{" + "id: " + id + ", nombre: " + nombre + ", direccion: " + direccion + ", telefono: " + telefono + "Nit: " + NIT + '}';
    }
}
