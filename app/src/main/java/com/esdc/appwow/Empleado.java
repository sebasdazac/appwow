package com.esdc.appwow;

import java.io.Serializable;

public class Empleado implements Serializable {

    private int avatar;
    private String nombres;
    private String apellidos;
    private String correo;
    private String cargo;

    public Empleado (int avatar, String nombres, String apellidos, String correo, String cargo){
        this.avatar  = avatar;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.cargo = cargo;
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
}
