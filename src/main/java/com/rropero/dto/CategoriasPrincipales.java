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
@Table(name = "categorias_principales", catalog = "rropero", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriasPrincipales.findAll", query = "SELECT c FROM CategoriasPrincipales c"),
    @NamedQuery(name = "CategoriasPrincipales.findByCategoria", query = "SELECT c FROM CategoriasPrincipales c WHERE c.categoriasPrincipalesPK.categoria = :categoria"),
    @NamedQuery(name = "CategoriasPrincipales.findByCategoriaAbrev", query = "SELECT c FROM CategoriasPrincipales c WHERE c.categoriaAbrev = :categoriaAbrev"),
    @NamedQuery(name = "CategoriasPrincipales.findBySubCategoria", query = "SELECT c FROM CategoriasPrincipales c WHERE c.categoriasPrincipalesPK.subCategoria = :subCategoria"),
    @NamedQuery(name = "CategoriasPrincipales.findBySubCategoriaAbrev", query = "SELECT c FROM CategoriasPrincipales c WHERE c.subCategoriaAbrev = :subCategoriaAbrev"),
    @NamedQuery(name = "CategoriasPrincipales.findBySubCategoriaArticulo", query = "SELECT c FROM CategoriasPrincipales c WHERE c.categoriasPrincipalesPK.subCategoriaArticulo = :subCategoriaArticulo"),
    @NamedQuery(name = "CategoriasPrincipales.findBySubCategoriaArticuloAbrev", query = "SELECT c FROM CategoriasPrincipales c WHERE c.subCategoriaArticuloAbrev = :subCategoriaArticuloAbrev"),
    @NamedQuery(name = "CategoriasPrincipales.findByPesoAmbiental", query = "SELECT c FROM CategoriasPrincipales c WHERE c.pesoAmbiental = :pesoAmbiental"),
    @NamedQuery(name = "CategoriasPrincipales.findByPesoEnvio", query = "SELECT c FROM CategoriasPrincipales c WHERE c.pesoEnvio = :pesoEnvio")})
public class CategoriasPrincipales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CategoriasPrincipalesPK categoriasPrincipalesPK;
    @Column(name = "categoria_abrev")
    private String categoriaAbrev;
    @Column(name = "sub_categoria_abrev")
    private String subCategoriaAbrev;
    @Column(name = "sub_categoria_articulo_abrev")
    private String subCategoriaArticuloAbrev;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "peso_ambiental")
    private Double pesoAmbiental;
    @Column(name = "peso_envio")
    private Double pesoEnvio;

    public CategoriasPrincipales() {
    }

    public CategoriasPrincipales(CategoriasPrincipalesPK categoriasPrincipalesPK) {
        this.categoriasPrincipalesPK = categoriasPrincipalesPK;
    }

    public CategoriasPrincipales(String categoria, String subCategoria, String subCategoriaArticulo) {
        this.categoriasPrincipalesPK = new CategoriasPrincipalesPK(categoria, subCategoria, subCategoriaArticulo);
    }

    public CategoriasPrincipalesPK getCategoriasPrincipalesPK() {
        return categoriasPrincipalesPK;
    }

    public void setCategoriasPrincipalesPK(CategoriasPrincipalesPK categoriasPrincipalesPK) {
        this.categoriasPrincipalesPK = categoriasPrincipalesPK;
    }

    public String getCategoriaAbrev() {
        return categoriaAbrev;
    }

    public void setCategoriaAbrev(String categoriaAbrev) {
        this.categoriaAbrev = categoriaAbrev;
    }

    public String getSubCategoriaAbrev() {
        return subCategoriaAbrev;
    }

    public void setSubCategoriaAbrev(String subCategoriaAbrev) {
        this.subCategoriaAbrev = subCategoriaAbrev;
    }

    public String getSubCategoriaArticuloAbrev() {
        return subCategoriaArticuloAbrev;
    }

    public void setSubCategoriaArticuloAbrev(String subCategoriaArticuloAbrev) {
        this.subCategoriaArticuloAbrev = subCategoriaArticuloAbrev;
    }

    public Double getPesoAmbiental() {
        return pesoAmbiental;
    }

    public void setPesoAmbiental(Double pesoAmbiental) {
        this.pesoAmbiental = pesoAmbiental;
    }

    public Double getPesoEnvio() {
        return pesoEnvio;
    }

    public void setPesoEnvio(Double pesoEnvio) {
        this.pesoEnvio = pesoEnvio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoriasPrincipalesPK != null ? categoriasPrincipalesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriasPrincipales)) {
            return false;
        }
        CategoriasPrincipales other = (CategoriasPrincipales) object;
        if ((this.categoriasPrincipalesPK == null && other.categoriasPrincipalesPK != null) || (this.categoriasPrincipalesPK != null && !this.categoriasPrincipalesPK.equals(other.categoriasPrincipalesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.CategoriasPrincipales[ categoriasPrincipalesPK=" + categoriasPrincipalesPK + " ]";
    }
    
}
