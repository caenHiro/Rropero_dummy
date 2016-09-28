/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rropero.dto;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author INE
 */
@Entity
@Table(name = "usuario_datos", catalog = "rropero", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioDatos.findAll", query = "SELECT u FROM UsuarioDatos u"),
    @NamedQuery(name = "UsuarioDatos.findByIdDatosCliente", query = "SELECT u FROM UsuarioDatos u WHERE u.idDatosCliente = :idDatosCliente"),
    @NamedQuery(name = "UsuarioDatos.findByTipoCliente", query = "SELECT u FROM UsuarioDatos u WHERE u.tipoCliente = :tipoCliente")})
public class UsuarioDatos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_datos_cliente")
    private Integer idDatosCliente;
    @Column(name = "tipo_cliente")
    private String tipoCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioDatos")
    private Collection<UsuarioLogin> usuarioLoginCollection;

    public UsuarioDatos() {
    }

    public UsuarioDatos(Integer idDatosCliente) {
        this.idDatosCliente = idDatosCliente;
    }

    public Integer getIdDatosCliente() {
        return idDatosCliente;
    }

    public void setIdDatosCliente(Integer idDatosCliente) {
        this.idDatosCliente = idDatosCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @XmlTransient
    public Collection<UsuarioLogin> getUsuarioLoginCollection() {
        return usuarioLoginCollection;
    }

    public void setUsuarioLoginCollection(Collection<UsuarioLogin> usuarioLoginCollection) {
        this.usuarioLoginCollection = usuarioLoginCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatosCliente != null ? idDatosCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioDatos)) {
            return false;
        }
        UsuarioDatos other = (UsuarioDatos) object;
        if ((this.idDatosCliente == null && other.idDatosCliente != null) || (this.idDatosCliente != null && !this.idDatosCliente.equals(other.idDatosCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.UsuarioDatos[ idDatosCliente=" + idDatosCliente + " ]";
    }
    
}
