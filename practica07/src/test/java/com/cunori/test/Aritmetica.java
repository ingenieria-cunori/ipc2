/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunori.test;

import com.cunori.operaciones.Operacion;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author hendrick
 */
public class Aritmetica {

    private final Operacion op;

    public Aritmetica() {
        this.op = new Operacion();
    }
    
    

    @Test(groups = {"g1"})
    public void testSumar() {
        //Operacion op = new Operacion();
        Assert.assertEquals(30, op.sumar(10, 20));
        System.out.println("testSumar");
    }

    @Test(groups = {"g1"})
    public void testSumar2() {
        //Operacion op = new Operacion();
        Assert.assertEquals(300, op.sumar(100, 200));
        System.out.println("testSumar2");
    }

    @Test(groups = {"g2"})
    public void testRestar() {
        //Operacion op = new Operacion();
        Assert.assertEquals(10, op.restar(30, 20));
        System.out.println("testRestart");
    }

    @Test(groups = {"g1", "g2"})
    public void testRestar2() {
        //Operacion op = new Operacion();
        Assert.assertEquals(0, op.restar(20, 20));
        System.out.println("testRestar2");
    }

    @BeforeMethod
    public void t1() {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void t2() {
        System.out.println("@AfterMethod");
    }

    @BeforeClass
    public void t0() {
        //this.op = new Operacion();
    }

    @BeforeTest
    public void testini() {
        System.out.println("Antes del test");
        //this.op = new Operacion();
    }

    @AfterTest
    public void testfin() {
        System.out.println("Despues del test");
    }
}
