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
@Table(name = "materiales", catalog = "rropero", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materiales.findAll", query = "SELECT m FROM Materiales m"),
    @NamedQuery(name = "Materiales.findByIdMaterial", query = "SELECT m FROM Materiales m WHERE m.materialesPK.idMaterial = :idMaterial"),
    @NamedQuery(name = "Materiales.findByCategoriaMaterial", query = "SELECT m FROM Materiales m WHERE m.materialesPK.categoriaMaterial = :categoriaMaterial"),
    @NamedQuery(name = "Materiales.findByMeterial", query = "SELECT m FROM Materiales m WHERE m.materialesPK.meterial = :meterial"),
    @NamedQuery(name = "Materiales.findByPeso", query = "SELECT m FROM Materiales m WHERE m.peso = :peso"),
    @NamedQuery(name = "Materiales.findByDensidad", query = "SELECT m FROM Materiales m WHERE m.densidad = :densidad"),
    @NamedQuery(name = "Materiales.findByFactorEnergia", query = "SELECT m FROM Materiales m WHERE m.factorEnergia = :factorEnergia"),
    @NamedQuery(name = "Materiales.findByFactorCo2", query = "SELECT m FROM Materiales m WHERE m.factorCo2 = :factorCo2"),
    @NamedQuery(name = "Materiales.findByUsoAgua", query = "SELECT m FROM Materiales m WHERE m.usoAgua = :usoAgua")})
public class Materiales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MaterialesPK materialesPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "peso")
    private Double peso;
    @Column(name = "densidad")
    private Double densidad;
    @Column(name = "factor_energia")
    private Double factorEnergia;
    @Column(name = "factor_co2")
    private Double factorCo2;
    @Column(name = "uso_agua")
    private Double usoAgua;

    public Materiales() {
    }

    public Materiales(MaterialesPK materialesPK) {
        this.materialesPK = materialesPK;
    }

    public Materiales(int idMaterial, String categoriaMaterial, String meterial) {
        this.materialesPK = new MaterialesPK(idMaterial, categoriaMaterial, meterial);
    }

    public MaterialesPK getMaterialesPK() {
        return materialesPK;
    }

    public void setMaterialesPK(MaterialesPK materialesPK) {
        this.materialesPK = materialesPK;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getDensidad() {
        return densidad;
    }

    public void setDensidad(Double densidad) {
        this.densidad = densidad;
    }

    public Double getFactorEnergia() {
        return factorEnergia;
    }

    public void setFactorEnergia(Double factorEnergia) {
        this.factorEnergia = factorEnergia;
    }

    public Double getFactorCo2() {
        return factorCo2;
    }

    public void setFactorCo2(Double factorCo2) {
        this.factorCo2 = factorCo2;
    }

    public Double getUsoAgua() {
        return usoAgua;
    }

    public void setUsoAgua(Double usoAgua) {
        this.usoAgua = usoAgua;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (materialesPK != null ? materialesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materiales)) {
            return false;
        }
        Materiales other = (Materiales) object;
        if ((this.materialesPK == null && other.materialesPK != null) || (this.materialesPK != null && !this.materialesPK.equals(other.materialesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.Materiales[ materialesPK=" + materialesPK + " ]";
    }
    
}
