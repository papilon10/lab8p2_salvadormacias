/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8p2_salvadormacias;

/**
 *
 * @author papilon10
 */
public class nadador {

    String nombre;
    String nacionalidad;
    int edad;
    Double estatura;
    String estilo;
    int distancia;
    int tiempo;
    int medallas;

    public nadador() {
    }

    public nadador(String nombre, String nacionalidad, int edad, Double estatura, String estilo, int distancia, int tiempo, int medallas) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.estatura = estatura;
        this.estilo = estilo;
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.medallas = medallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    @Override
    public String toString() {
        return "nadador{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", estatura=" + estatura + ", estilo=" + estilo + ", distancia=" + distancia + ", tiempo=" + tiempo + ", medallas=" + medallas + '}';
    }

}
