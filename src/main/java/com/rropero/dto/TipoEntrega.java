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
@Table(name = "tipo_entrega", catalog = "rropero", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoEntrega.findAll", query = "SELECT t FROM TipoEntrega t"),
    @NamedQuery(name = "TipoEntrega.findByCategoriaEntrega", query = "SELECT t FROM TipoEntrega t WHERE t.categoriaEntrega = :categoriaEntrega"),
    @NamedQuery(name = "TipoEntrega.findByCategoriaEntregaAbrev", query = "SELECT t FROM TipoEntrega t WHERE t.categoriaEntregaAbrev = :categoriaEntregaAbrev")})
public class TipoEntrega implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "categoria_entrega")
    private String categoriaEntrega;
    @Column(name = "categoria_entrega_abrev")
    private String categoriaEntregaAbrev;

    public TipoEntrega() {
    }

    public TipoEntrega(String categoriaEntrega) {
        this.categoriaEntrega = categoriaEntrega;
    }

    public String getCategoriaEntrega() {
        return categoriaEntrega;
    }

    public void setCategoriaEntrega(String categoriaEntrega) {
        this.categoriaEntrega = categoriaEntrega;
    }

    public String getCategoriaEntregaAbrev() {
        return categoriaEntregaAbrev;
    }

    public void setCategoriaEntregaAbrev(String categoriaEntregaAbrev) {
        this.categoriaEntregaAbrev = categoriaEntregaAbrev;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoriaEntrega != null ? categoriaEntrega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEntrega)) {
            return false;
        }
        TipoEntrega other = (TipoEntrega) object;
        if ((this.categoriaEntrega == null && other.categoriaEntrega != null) || (this.categoriaEntrega != null && !this.categoriaEntrega.equals(other.categoriaEntrega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.TipoEntrega[ categoriaEntrega=" + categoriaEntrega + " ]";
    }
    
}
