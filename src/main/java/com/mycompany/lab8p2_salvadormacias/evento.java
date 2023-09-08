/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8p2_salvadormacias;

/**
 *
 * @author papilon10
 */
public class evento {

    String estilo;
    int distancia;
    int record;

    public evento() {
    }

    public evento(String estilo, int distancia, int record) {
        this.estilo = estilo;
        this.distancia = distancia;
        this.record = record;
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

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "evento{" + "estilo=" + estilo + ", distancia=" + distancia + ", record=" + record + '}';
    }

}
