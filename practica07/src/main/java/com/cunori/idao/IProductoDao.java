/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cunori.idao;

import com.cunori.model.Producto;
import java.util.List;

/**
 *
 * @author hendrick
 */
public interface IProductoDao {
    public List<Producto> getProductos();
    public Producto insertProducto(Producto p);
    public boolean updateProducto(Producto p);
    public boolean deleteProducto(int id);
    public boolean getActivo();
}
