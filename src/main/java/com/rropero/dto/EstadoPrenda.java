/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rropero.dto;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author INE
 */
@Entity
@Table(name = "estado_prenda", catalog = "rropero", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoPrenda.findAll", query = "SELECT e FROM EstadoPrenda e"),
    @NamedQuery(name = "EstadoPrenda.findByEstadoPrenda", query = "SELECT e FROM EstadoPrenda e WHERE e.estadoPrenda = :estadoPrenda"),
    @NamedQuery(name = "EstadoPrenda.findByEstadoPrendaAbrev", query = "SELECT e FROM EstadoPrenda e WHERE e.estadoPrendaAbrev = :estadoPrendaAbrev"),
    @NamedQuery(name = "EstadoPrenda.findByPorcentajeDescuento", query = "SELECT e FROM EstadoPrenda e WHERE e.porcentajeDescuento = :porcentajeDescuento")})
public class EstadoPrenda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "estado_prenda")
    private String estadoPrenda;
    @Column(name = "estado_prenda_abrev")
    private String estadoPrendaAbrev;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "porcentaje_descuento")
    private Double porcentajeDescuento;

    public EstadoPrenda() {
    }

    public EstadoPrenda(String estadoPrenda) {
        this.estadoPrenda = estadoPrenda;
    }

    public String getEstadoPrenda() {
        return estadoPrenda;
    }

    public void setEstadoPrenda(String estadoPrenda) {
        this.estadoPrenda = estadoPrenda;
    }

    public String getEstadoPrendaAbrev() {
        return estadoPrendaAbrev;
    }

    public void setEstadoPrendaAbrev(String estadoPrendaAbrev) {
        this.estadoPrendaAbrev = estadoPrendaAbrev;
    }

    public Double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estadoPrenda != null ? estadoPrenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoPrenda)) {
            return false;
        }
        EstadoPrenda other = (EstadoPrenda) object;
        if ((this.estadoPrenda == null && other.estadoPrenda != null) || (this.estadoPrenda != null && !this.estadoPrenda.equals(other.estadoPrenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.EstadoPrenda[ estadoPrenda=" + estadoPrenda + " ]";
    }
    
}
