package com.example.rishardcarranza.evaluacion1;

import java.io.Serializable;


public class Estudiante implements Serializable {
    String nombre;
    String codigo;
    String materia;
    Double p1;
    Double p2;
    Double p3;
    Double promedio;

    public Estudiante(String nombre, String codigo, String materia, Double p1, Double p2, Double p3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.materia = materia;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Double getP1() {
        return p1;
    }

    public void setP1(Double p1) {
        this.p1 = p1;
    }

    public Double getP2() {
        return p2;
    }

    public void setP2(Double p2) {
        this.p2 = p2;
    }

    public Double getP3() {
        return p3;
    }

    public void setP3(Double p3) {
        this.p3 = p3;
    }

    public Double getPromedio() {

        return ((p1*0.3) + (p2*0.3) + (p3*0.4));
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
}
