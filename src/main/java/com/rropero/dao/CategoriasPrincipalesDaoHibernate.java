/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rropero.dao;

import com.rropero.dto.CategoriasPrincipales;
import java.util.List;

/**
 *
 * @author INE
 */
public interface CategoriasPrincipalesDaoHibernate {
        public void addCategoriasPrincipales(CategoriasPrincipales p);
	public void updateCategoriasPrincipales(CategoriasPrincipales p);
	public List<CategoriasPrincipales> listCategoriasPrincipales();
	public void removePerson(CategoriasPrincipales p);
    
}
