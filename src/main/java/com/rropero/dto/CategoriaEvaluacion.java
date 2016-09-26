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
@Table(name = "categoria_evaluacion", catalog = "rropero", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriaEvaluacion.findAll", query = "SELECT c FROM CategoriaEvaluacion c"),
    @NamedQuery(name = "CategoriaEvaluacion.findByMarca", query = "SELECT c FROM CategoriaEvaluacion c WHERE c.marca = :marca"),
    @NamedQuery(name = "CategoriaEvaluacion.findByCategoriaMarca", query = "SELECT c FROM CategoriaEvaluacion c WHERE c.categoriaMarca = :categoriaMarca")})
public class CategoriaEvaluacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;
    @Column(name = "categoria_marca")
    private String categoriaMarca;

    public CategoriaEvaluacion() {
    }

    public CategoriaEvaluacion(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoriaMarca() {
        return categoriaMarca;
    }

    public void setCategoriaMarca(String categoriaMarca) {
        this.categoriaMarca = categoriaMarca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marca != null ? marca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaEvaluacion)) {
            return false;
        }
        CategoriaEvaluacion other = (CategoriaEvaluacion) object;
        if ((this.marca == null && other.marca != null) || (this.marca != null && !this.marca.equals(other.marca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.CategoriaEvaluacion[ marca=" + marca + " ]";
    }
    
}
