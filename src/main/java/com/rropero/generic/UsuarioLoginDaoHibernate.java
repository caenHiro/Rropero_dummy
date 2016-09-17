
package com.rropero.generic;
import com.rropero.AbstractDao;
import com.rropero.DataAccessLayerException;
import com.rropero.dto.UsuarioLogin;

import java.util.List;

/**
 *
 * @author CaenHiro
 */
public class UsuarioLoginDaoHibernate  extends AbstractDao{
    
     public UsuarioLoginDaoHibernate() {
        super();
    }
    
    /**
     * Insert a new Usuario into the database.
     *
     * @param CAEN
     */
    public void save(UsuarioLogin producto) throws DataAccessLayerException {
        super.save(producto);
    }

    /**
     * Updates a new Usuario into the database.
     *
     * @param usuario
     */
    public void update(UsuarioLogin producto) throws DataAccessLayerException {
        super.update(producto);
    }

    /**
     * Delete a detached Usuario from the database.
     *
     * @param usuario
     */
    public void delete(UsuarioLogin producto) throws DataAccessLayerException {
        super.delete(producto);
    }

    /**
     * Find an Event by its primary key.
     *
     * @param id
     * @return
     */
    public UsuarioLogin find(Long id) throws DataAccessLayerException {
        return (UsuarioLogin) super.find(UsuarioLogin.class, id);
    }

    /**
     * Lista todos los usuarios de la base de datos
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(UsuarioLogin.class);
    }
}