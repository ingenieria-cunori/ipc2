/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunori.model;

/**
 *
 * @author hendrick
 */
public class Producto {
    private int idproducto;
    private String nombre;
    private float precio;
    private boolean activo;

    public Producto() {
    }

    public Producto(int idproducto, String nombre, float precio, boolean activo) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.precio = precio;
        this.activo = activo;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Producto{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", precio=" + precio + ", activo=" + activo + '}';
    }
   
    
}
