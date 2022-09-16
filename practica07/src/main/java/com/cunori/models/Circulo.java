/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunori.models;

/**
 *
 * @author hendrick
 */
public class Circulo {
    private Float radio;
    private final Double Pi = 3.1415;

    public Circulo() {
    }

    public Circulo(Float diametro) {
        this.radio = diametro;
    }

    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float diametro) {
        this.radio = diametro;
    }

    
    public Double area(){
        return this.Pi * Math.pow(this.radio, 2);
    }
    
    @Override
    public String toString() {
        return "Circulo{" + "diametro=" + radio + '}';
    }
    
    
    
}
