/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunori.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hendrick
 */
public class Conexion {

    private Connection conn;
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/analisis";
    private final String USER = "admin";
    private final String PASSWORD = "admin";

    public Conexion() {
        try {
            Class.forName(this.DRIVER);
            conn = DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.toString());
        }
    }

    public Connection getConn() {
        return this.conn;
    }

    public void close() {
        try {
            if (!this.conn.isClosed()) {
                this.conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

    }
}
