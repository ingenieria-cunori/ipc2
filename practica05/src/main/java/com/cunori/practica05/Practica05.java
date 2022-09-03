/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cunori.practica05;

import com.cunori.dao.ProductoDaoImpl;
import com.cunori.model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hendrick
 */
public class Practica05 {

    public static void main(String[] args) {
        List<Producto> lista = new ArrayList<>();
        ProductoDaoImpl i = new ProductoDaoImpl();
        try {            
            lista = i.getProductos();
            for (Producto producto : lista) {
                System.out.println(producto.toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        Producto p = new Producto(0,"Juguito de tristeza 250ml", 4.50f, true);
        i.insertProducto(p);
        
        p = new Producto(10, "Juguito de tristeza 2 Galón", 230.50f, true);
        System.out.println("Ejecutando el update");
        System.out.println(i.updateProducto(p));
        
        System.out.println("Ejecutando el delete");
        System.out.println(i.deleteProducto(4));
    }
}
