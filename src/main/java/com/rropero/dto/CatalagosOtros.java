/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rropero.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author INE
 */
@Entity
@Table(name = "catalagos_otros", catalog = "rropero", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalagosOtros.findAll", query = "SELECT c FROM CatalagosOtros c"),
    @NamedQuery(name = "CatalagosOtros.findByIdOtro", query = "SELECT c FROM CatalagosOtros c WHERE c.catalagosOtrosPK.idOtro = :idOtro"),
    @NamedQuery(name = "CatalagosOtros.findBySku", query = "SELECT c FROM CatalagosOtros c WHERE c.catalagosOtrosPK.sku = :sku"),
    @NamedQuery(name = "CatalagosOtros.findByOtroDesc", query = "SELECT c FROM CatalagosOtros c WHERE c.otroDesc = :otroDesc"),
    @NamedQuery(name = "CatalagosOtros.findByTabla", query = "SELECT c FROM CatalagosOtros c WHERE c.catalagosOtrosPK.tabla = :tabla")})
public class CatalagosOtros implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CatalagosOtrosPK catalagosOtrosPK;
    @Column(name = "otro_desc")
    private String otroDesc;

    public CatalagosOtros() {
    }

    public CatalagosOtros(CatalagosOtrosPK catalagosOtrosPK) {
        this.catalagosOtrosPK = catalagosOtrosPK;
    }

    public CatalagosOtros(int idOtro, String sku, String tabla) {
        this.catalagosOtrosPK = new CatalagosOtrosPK(idOtro, sku, tabla);
    }

    public CatalagosOtrosPK getCatalagosOtrosPK() {
        return catalagosOtrosPK;
    }

    public void setCatalagosOtrosPK(CatalagosOtrosPK catalagosOtrosPK) {
        this.catalagosOtrosPK = catalagosOtrosPK;
    }

    public String getOtroDesc() {
        return otroDesc;
    }

    public void setOtroDesc(String otroDesc) {
        this.otroDesc = otroDesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catalagosOtrosPK != null ? catalagosOtrosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalagosOtros)) {
            return false;
        }
        CatalagosOtros other = (CatalagosOtros) object;
        if ((this.catalagosOtrosPK == null && other.catalagosOtrosPK != null) || (this.catalagosOtrosPK != null && !this.catalagosOtrosPK.equals(other.catalagosOtrosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.CatalagosOtros[ catalagosOtrosPK=" + catalagosOtrosPK + " ]";
    }
    
}
