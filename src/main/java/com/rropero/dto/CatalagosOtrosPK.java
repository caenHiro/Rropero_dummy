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
public class CatalagosOtrosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_otro")
    private int idOtro;
    @Basic(optional = false)
    @Column(name = "sku")
    private String sku;
    @Basic(optional = false)
    @Column(name = "tabla")
    private String tabla;

    public CatalagosOtrosPK() {
    }

    public CatalagosOtrosPK(int idOtro, String sku, String tabla) {
        this.idOtro = idOtro;
        this.sku = sku;
        this.tabla = tabla;
    }

    public int getIdOtro() {
        return idOtro;
    }

    public void setIdOtro(int idOtro) {
        this.idOtro = idOtro;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idOtro;
        hash += (sku != null ? sku.hashCode() : 0);
        hash += (tabla != null ? tabla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalagosOtrosPK)) {
            return false;
        }
        CatalagosOtrosPK other = (CatalagosOtrosPK) object;
        if (this.idOtro != other.idOtro) {
            return false;
        }
        if ((this.sku == null && other.sku != null) || (this.sku != null && !this.sku.equals(other.sku))) {
            return false;
        }
        if ((this.tabla == null && other.tabla != null) || (this.tabla != null && !this.tabla.equals(other.tabla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.CatalagosOtrosPK[ idOtro=" + idOtro + ", sku=" + sku + ", tabla=" + tabla + " ]";
    }
    
}
