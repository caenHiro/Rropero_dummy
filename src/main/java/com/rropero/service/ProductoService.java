package com.rropero.service;

import com.rropero.dto.Producto;
import java.util.List;

/**
 *
 * @author Pilar Hdez
 */
public interface ProductoService {
    
    public Producto getProductoById(Integer id);
    public List<Producto> getAll();
    public void deleteProducto(Integer id);
    public void insertProducto(Producto producto);
    public void updateProducto(Producto producto);
}
