/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cunori.test1;

import com.cunori.models.Rectangulo;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hendrick
 */
public class RectanguloTest {
    
    public RectanguloTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
        System.out.println("SetUp Class BeforeAll");
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
        System.out.println("SetUp Class AfterAll");
    }

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("Configurando antes de cada Test");
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("Configurando despues de cada Test");
    }
    
 
    /**
     * Test of getX method, of class Rectangulo.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Rectangulo instance = new Rectangulo();
        Float expResult = null;
        Float result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Rectangulo.
     */
    @org.junit.jupiter.api.Test
    public void testSetX() {
        System.out.println("setX");
        Float x = null;
        Rectangulo instance = new Rectangulo();
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Rectangulo.
     */
    @org.junit.jupiter.api.Test
    public void testGetY() {
        System.out.println("getY");
        Rectangulo instance = new Rectangulo();
        Float expResult = null;
        Float result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Rectangulo.
     */
    @org.junit.jupiter.api.Test
    public void testSetY() {
        System.out.println("setY");
        Float y = null;
        Rectangulo instance = new Rectangulo();
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of area method, of class Rectangulo.
     */
    @org.junit.jupiter.api.Test
    public void testArea() {
        System.out.println("area");
        Rectangulo instance = new Rectangulo();
        Float expResult = null;
        Float result = instance.area();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Rectangulo.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        Rectangulo instance = new Rectangulo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
