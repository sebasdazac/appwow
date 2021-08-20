package com.esdc.appwow;

import java.io.Serializable;

public class Empleado implements Serializable {

    private int avatar;
    private String nombres;
    private String apellidos;
    private String correo;
    private String cargo;
    private String descripcion;

    public Empleado (int avatar, String nombres, String apellidos, String correo, String cargo, String descripcion){
        this.avatar  = avatar;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.cargo = cargo;
        this.descripcion = descripcion;
    }

    public int getAvatar() {
        return avatar;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
