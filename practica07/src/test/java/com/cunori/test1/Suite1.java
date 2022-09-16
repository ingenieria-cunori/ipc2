/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.cunori.test1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 *
 * @author hendrick
 */

@RunWith(org.junit.platform.runner.JUnitPlatform.class)
@SelectPackages("com.cunori.test1")
public class Suite1 {

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Antes de cada clase");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("Despues de cada clase");
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
