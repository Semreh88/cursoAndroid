package com.example.clases_objetos;

public class Usuario {
    private int identificacion;
    private String nombre;
    private String correo;
    private int edad;


    public void setIdentificacion(int identificacion){
        this.identificacion = identificacion;
    }
    public int getIdentificacion() {
        return identificacion;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
