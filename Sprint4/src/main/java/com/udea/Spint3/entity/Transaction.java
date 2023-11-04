package com.udea.Spint3.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    @Column
    public double montoTransaccion;
    @Column
    public String concepto;
    @Column
    public  String usuarioTransaccion;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //Getter y setter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getMontoTransaccion() {
        return montoTransaccion;
    }

    public void setMontoTransaccion(double montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuarioTransaccion() {
        return usuarioTransaccion;
    }

    public void setUsuarioTransaccion(String usuarioTransaccion) {
        this.usuarioTransaccion = usuarioTransaccion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
