/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunori.test;

import com.cunori.dao.ProductoDaoImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author hendrick
 */
public class TestProductos {
    private final ProductoDaoImpl i;

    public TestProductos() {
        this.i = new ProductoDaoImpl();
    }
            
    
    @Test
    public void testGetProductos(){        
        System.out.println(i.getProductos().size());
        Assert.assertEquals(8, i.getProductos().size());
    }
}
