
package com.rropero.daoImpl;
import com.rropero.dao.AbstractDao;
import com.rropero.DataAccessLayerException;
import com.rropero.dto.UsuarioLogin;

import java.util.List;

/**
 *
 * @author Caen
 */
public class UsuarioLoginDaoHibernate  extends AbstractDao{
    
     public UsuarioLoginDaoHibernate() {
        super();
    }
    
    /**
     * Insert a new Usuario into the database.
     *
     * @param usuario
     */
    public void save(UsuarioLogin usuario) throws DataAccessLayerException {
        super.save(usuario);
    }

    /**
     * Updates a new Usuario into the database.
     *
     * @param usuario
     */
    public void update(UsuarioLogin usuario) throws DataAccessLayerException {
        super.update(usuario);
    }

    /**
     * Delete a detached Usuario from the database.
     *
     * @param usuario
     */
    public void delete(UsuarioLogin usuario) throws DataAccessLayerException {
        super.delete(usuario);
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
