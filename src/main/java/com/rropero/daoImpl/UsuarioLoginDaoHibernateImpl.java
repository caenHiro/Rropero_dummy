
package com.rropero.daoImpl;

import com.rropero.dto.UsuarioLogin;

import java.util.List;

/**
 *
 * @author Caen
 */
public class UsuarioLoginDaoHibernateImpl  {
    
     public UsuarioLoginDaoHibernateImpl() {
        super();
    }
    
    /**
     * Insert a new Usuario into the database.
     *
     * @param usuario
     */
    public void save(UsuarioLogin usuario) {
//        super.save(usuario);
    }

    /**
     * Updates a new Usuario into the database.
     *
     * @param usuario
     */
    public void update(UsuarioLogin usuario){
//        super.update(usuario);
    }

    /**
     * Delete a detached Usuario from the database.
     *
     * @param usuario
     */
    public void delete(UsuarioLogin usuario)  {
//        super.delete(usuario);
    }

    /**
     * Find an Event by its primary key.
     *
     * @param id
     * @return
     */
    public UsuarioLogin find(Long id)  {
        return null; //(UsuarioLogin) super.find(UsuarioLogin.class, id);
    }

    /**
     * Lista todos los usuarios de la base de datos
     *
     * @return
     */
    public List findAll() {
        return null ; //super.findAll(UsuarioLogin.class);
    }
}
