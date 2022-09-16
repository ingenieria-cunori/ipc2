/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cunori.test1;

import com.cunori.models.Circulo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Tag;

/**
 *
 * @author hendrick
 */
public class CirculoTest {
    
    public CirculoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getRadio method, of class Circulo.
     */
    @Tag("t1")    
    @Test
    public void testGetRadio() {
        System.out.println("getRadio");
        Circulo instance = new Circulo();
        Float expResult = null;
        Float result = instance.getRadio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRadio method, of class Circulo.
     */
    @Test
    public void testSetRadio() {
        System.out.println("setRadio");
        Float diametro = null;
        Circulo instance = new Circulo();
        instance.setRadio(diametro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of area method, of class Circulo.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Circulo instance = new Circulo();
        Double expResult = null;
        Double result = instance.area();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Circulo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Circulo instance = new Circulo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    
}
