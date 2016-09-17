package com.rropero;

import com.rropero.dto.Producto;
import java.util.List;

/**
 *
 * @author 
 */
public class ProductoDaoHibernate extends AbstractDao {

    public ProductoDaoHibernate() {
        super();
    }

    /**
     * Insert a new Usuario into the database.
     *
     * @param CAEN
     */
    public void save(Producto producto) throws DataAccessLayerException {
        super.save(producto);
    }

    /**
     * Updates a new Usuario into the database.
     *
     * @param usuario
     */
    public void update(Producto producto) throws DataAccessLayerException {
        super.update(producto);
    }

    /**
     * Delete a detached Usuario from the database.
     *
     * @param usuario
     */
    public void delete(Producto producto) throws DataAccessLayerException {
        super.delete(producto);
    }

    /**
     * Find an Event by its primary key.
     *
     * @param id
     * @return
     */
    public Producto find(Long id) throws DataAccessLayerException {
        return (Producto) super.find(Producto.class, id);
    }

    /**
     * Lista todos los usuarios de la base de datos
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Producto.class);
    }
}
