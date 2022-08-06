/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunori.models;

/**
 *
 * @author hendrick
 */
public class Estudiante {

    private int carne;
    private String nombre;
    private boolean genero;

    public Estudiante() {
    }

    public Estudiante(int carne, String nombre, boolean genero) {
        this.carne = carne;
        this.nombre = nombre;
        this.genero = genero;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        if (this.genero) {
            return "carné: " + this.carne + ", Nombre: " + this.nombre + ", Género: Masculino";
        } else {
            return "carné: " + this.carne + ", Nombre: " + this.nombre + ", Género: Femenino";
        }
    }

}
