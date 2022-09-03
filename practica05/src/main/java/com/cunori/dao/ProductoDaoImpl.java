/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunori.dao;

import com.cunori.idao.IProductoDao;
import com.cunori.model.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hendrick
 */
public class ProductoDaoImpl implements IProductoDao{
    private final String SQLC = "insert into producto "
            + "(nombre, precio, activo) value "
            + "(?,?,?)";
    private final String SQLR = "select * from producto";    
    private final String SQLU = "update producto set nombre = ?, "
            + "precio = ?, activo = ? where idproducto = ?";
    private final String SQLD = "delete from producto where idproducto = ?";
    
    

    @Override
    public List<Producto> getProductos() {
        Conexion miConexion = new Conexion();
        List<Producto> lista = new ArrayList<>();
        Producto producto;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = miConexion.getConn().prepareStatement(SQLR);
            rs = ps.executeQuery();
            while (rs.next()) {                
                producto = new Producto();
                producto.setIdproducto(rs.getInt("idproducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getFloat("precio"));
                producto.setActivo(rs.getBoolean("activo"));
                lista.add(producto);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally{
            miConexion.close();            
        }
        return lista;
    }

    @Override
    public boolean getActivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto insertProducto(Producto p) {
        Conexion miConexion = new Conexion();        
        Producto producto = null;
        PreparedStatement ps = null;        
        try {            
            miConexion.getConn().setAutoCommit(false);
            ps = miConexion.getConn().prepareStatement(SQLC);
            ps.setString(1, p.getNombre());
            ps.setFloat(2, p.getPrecio());
            ps.setBoolean(3, p.isActivo());
            ps.executeUpdate();             
            miConexion.getConn().commit();            
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally{
            miConexion.close();            
        }
        return producto;
    }

    @Override
    public boolean updateProducto(Producto p) {
        boolean res = false;
        Conexion miConexion = new Conexion();                
        PreparedStatement ps = null;        
        try {            
            miConexion.getConn().setAutoCommit(false);
            ps = miConexion.getConn().prepareStatement(SQLU);
            ps.setString(1, p.getNombre());
            ps.setFloat(2, p.getPrecio());
            ps.setBoolean(3, p.isActivo());
            ps.setInt(4, p.getIdproducto());
            ps.executeUpdate();             
            miConexion.getConn().commit();
            res = true;
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally{
            miConexion.close();            
        }
        return res;
    }

    @Override
    public boolean deleteProducto(int id) {
        boolean res = false;
        Conexion miConexion = new Conexion();                
        PreparedStatement ps = null;        
        try {            
            miConexion.getConn().setAutoCommit(false);
            ps = miConexion.getConn().prepareStatement(SQLD);            
            ps.setInt(1, id);
            ps.executeUpdate();             
            miConexion.getConn().commit();
            res = true;
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally{
            miConexion.close();            
        }
        return res;
    }
    
}
