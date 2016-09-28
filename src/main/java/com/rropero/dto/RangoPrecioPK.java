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
public class RangoPrecioPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "categoria_marca")
    private String categoriaMarca;
    @Basic(optional = false)
    @Column(name = "sub_categoria_articulo")
    private String subCategoriaArticulo;

    public RangoPrecioPK() {
    }

    public RangoPrecioPK(String categoriaMarca, String subCategoriaArticulo) {
        this.categoriaMarca = categoriaMarca;
        this.subCategoriaArticulo = subCategoriaArticulo;
    }

    public String getCategoriaMarca() {
        return categoriaMarca;
    }

    public void setCategoriaMarca(String categoriaMarca) {
        this.categoriaMarca = categoriaMarca;
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
        hash += (categoriaMarca != null ? categoriaMarca.hashCode() : 0);
        hash += (subCategoriaArticulo != null ? subCategoriaArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RangoPrecioPK)) {
            return false;
        }
        RangoPrecioPK other = (RangoPrecioPK) object;
        if ((this.categoriaMarca == null && other.categoriaMarca != null) || (this.categoriaMarca != null && !this.categoriaMarca.equals(other.categoriaMarca))) {
            return false;
        }
        if ((this.subCategoriaArticulo == null && other.subCategoriaArticulo != null) || (this.subCategoriaArticulo != null && !this.subCategoriaArticulo.equals(other.subCategoriaArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.RangoPrecioPK[ categoriaMarca=" + categoriaMarca + ", subCategoriaArticulo=" + subCategoriaArticulo + " ]";
    }
    
}
