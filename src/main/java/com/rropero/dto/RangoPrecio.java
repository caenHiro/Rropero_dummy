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
@Table(name = "rango_precio", catalog = "rropero", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RangoPrecio.findAll", query = "SELECT r FROM RangoPrecio r"),
    @NamedQuery(name = "RangoPrecio.findByCategoriaMarca", query = "SELECT r FROM RangoPrecio r WHERE r.rangoPrecioPK.categoriaMarca = :categoriaMarca"),
    @NamedQuery(name = "RangoPrecio.findBySubCategoriaArticulo", query = "SELECT r FROM RangoPrecio r WHERE r.rangoPrecioPK.subCategoriaArticulo = :subCategoriaArticulo"),
    @NamedQuery(name = "RangoPrecio.findByPrecioPromedio", query = "SELECT r FROM RangoPrecio r WHERE r.precioPromedio = :precioPromedio")})
public class RangoPrecio implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RangoPrecioPK rangoPrecioPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_promedio")
    private Double precioPromedio;

    public RangoPrecio() {
    }

    public RangoPrecio(RangoPrecioPK rangoPrecioPK) {
        this.rangoPrecioPK = rangoPrecioPK;
    }

    public RangoPrecio(String categoriaMarca, String subCategoriaArticulo) {
        this.rangoPrecioPK = new RangoPrecioPK(categoriaMarca, subCategoriaArticulo);
    }

    public RangoPrecioPK getRangoPrecioPK() {
        return rangoPrecioPK;
    }

    public void setRangoPrecioPK(RangoPrecioPK rangoPrecioPK) {
        this.rangoPrecioPK = rangoPrecioPK;
    }

    public Double getPrecioPromedio() {
        return precioPromedio;
    }

    public void setPrecioPromedio(Double precioPromedio) {
        this.precioPromedio = precioPromedio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rangoPrecioPK != null ? rangoPrecioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RangoPrecio)) {
            return false;
        }
        RangoPrecio other = (RangoPrecio) object;
        if ((this.rangoPrecioPK == null && other.rangoPrecioPK != null) || (this.rangoPrecioPK != null && !this.rangoPrecioPK.equals(other.rangoPrecioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.RangoPrecio[ rangoPrecioPK=" + rangoPrecioPK + " ]";
    }
    
}
