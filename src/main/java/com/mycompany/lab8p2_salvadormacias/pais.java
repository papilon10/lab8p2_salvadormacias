/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8p2_salvadormacias;

import java.util.ArrayList;

/**
 *
 * @author papilon10
 */
public class pais {

    String nombre;
    ArrayList<nadador> nadadores = new ArrayList<>();
    int medallas;

    public pais() {
    }

    public pais(String nombre, int medallas) {
        this.nombre = nombre;
        this.medallas = medallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<nadador> getNadadores() {
        return nadadores;
    }

    public void setNadadores(ArrayList<nadador> nadadores) {
        this.nadadores = nadadores;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    @Override
    public String toString() {
        return "pais{" + "nombre=" + nombre + ", nadadores=" + nadadores + ", medallas=" + medallas + '}';
    }

}
