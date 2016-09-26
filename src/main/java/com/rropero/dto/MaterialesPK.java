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
public class MaterialesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_material")
    private int idMaterial;
    @Basic(optional = false)
    @Column(name = "categoria_material")
    private String categoriaMaterial;
    @Basic(optional = false)
    @Column(name = "meterial")
    private String meterial;

    public MaterialesPK() {
    }

    public MaterialesPK(int idMaterial, String categoriaMaterial, String meterial) {
        this.idMaterial = idMaterial;
        this.categoriaMaterial = categoriaMaterial;
        this.meterial = meterial;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getCategoriaMaterial() {
        return categoriaMaterial;
    }

    public void setCategoriaMaterial(String categoriaMaterial) {
        this.categoriaMaterial = categoriaMaterial;
    }

    public String getMeterial() {
        return meterial;
    }

    public void setMeterial(String meterial) {
        this.meterial = meterial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idMaterial;
        hash += (categoriaMaterial != null ? categoriaMaterial.hashCode() : 0);
        hash += (meterial != null ? meterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaterialesPK)) {
            return false;
        }
        MaterialesPK other = (MaterialesPK) object;
        if (this.idMaterial != other.idMaterial) {
            return false;
        }
        if ((this.categoriaMaterial == null && other.categoriaMaterial != null) || (this.categoriaMaterial != null && !this.categoriaMaterial.equals(other.categoriaMaterial))) {
            return false;
        }
        if ((this.meterial == null && other.meterial != null) || (this.meterial != null && !this.meterial.equals(other.meterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.MaterialesPK[ idMaterial=" + idMaterial + ", categoriaMaterial=" + categoriaMaterial + ", meterial=" + meterial + " ]";
    }
    
}
