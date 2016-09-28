/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rropero.dto;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author INE
 */
@Embeddable
public class CategoriasPrincipalesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;
    @Basic(optional = false)
    @Column(name = "sub_categoria")
    private String subCategoria;
    @Basic(optional = false)
    @Column(name = "sub_categoria_articulo")
    private String subCategoriaArticulo;

    public CategoriasPrincipalesPK() {
    }

    public CategoriasPrincipalesPK(String categoria, String subCategoria, String subCategoriaArticulo) {
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.subCategoriaArticulo = subCategoriaArticulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getSubCategoriaArticulo() {
        return subCategoriaArticulo;
    }

    public void setSubCategoriaArticulo(String subCategoriaArticulo) {
        this.subCategoriaArticulo = subCategoriaArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoria != null ? categoria.hashCode() : 0);
        hash += (subCategoria != null ? subCategoria.hashCode() : 0);
        hash += (subCategoriaArticulo != null ? subCategoriaArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriasPrincipalesPK)) {
            return false;
        }
        CategoriasPrincipalesPK other = (CategoriasPrincipalesPK) object;
        if ((this.categoria == null && other.categoria != null) || (this.categoria != null && !this.categoria.equals(other.categoria))) {
            return false;
        }
        if ((this.subCategoria == null && other.subCategoria != null) || (this.subCategoria != null && !this.subCategoria.equals(other.subCategoria))) {
            return false;
        }
        if ((this.subCategoriaArticulo == null && other.subCategoriaArticulo != null) || (this.subCategoriaArticulo != null && !this.subCategoriaArticulo.equals(other.subCategoriaArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.CategoriasPrincipalesPK[ categoria=" + categoria + ", subCategoria=" + subCategoria + ", subCategoriaArticulo=" + subCategoriaArticulo + " ]";
    }
    
}
