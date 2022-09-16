/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunori.models;

/**
 *
 * @author hendrick
 */
public class Rectangulo {
    
    private Float x;
    private Float y;

    public Rectangulo() {
    }

    public Rectangulo(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }
    
    
    public Float area(){
        return this.x * this.y;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "x=" + x + ", y=" + y + '}';
    }

    
    
}
