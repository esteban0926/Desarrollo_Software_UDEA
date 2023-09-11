package org.UdeA.modelos;

public class Movimiento {
    private int id;
    private long  monto;
    private String concepto;

    private String tipo;

    private Empleados usuario;

    public Movimiento(int id, long monto, String concepto, String tipo, Empleados usuario) {
        this.id = id;
        this.monto = monto;
        this.concepto = concepto;
        this.tipo = tipo;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Empleados getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleados usuario) {
        this.usuario = usuario;
    }
}
