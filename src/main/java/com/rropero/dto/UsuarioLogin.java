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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author INE
 */
@Entity
@Table(name = "usuario_login", catalog = "rropero", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioLogin.findAll", query = "SELECT u FROM UsuarioLogin u"),
    @NamedQuery(name = "UsuarioLogin.findByIdCliente", query = "SELECT u FROM UsuarioLogin u WHERE u.usuarioLoginPK.idCliente = :idCliente"),
    @NamedQuery(name = "UsuarioLogin.findByIdDatosCliente", query = "SELECT u FROM UsuarioLogin u WHERE u.usuarioLoginPK.idDatosCliente = :idDatosCliente"),
    @NamedQuery(name = "UsuarioLogin.findByNombreCliente", query = "SELECT u FROM UsuarioLogin u WHERE u.nombreCliente = :nombreCliente"),
    @NamedQuery(name = "UsuarioLogin.findByEMail", query = "SELECT u FROM UsuarioLogin u WHERE u.eMail = :eMail"),
    @NamedQuery(name = "UsuarioLogin.findByPass", query = "SELECT u FROM UsuarioLogin u WHERE u.pass = :pass")})
public class UsuarioLogin implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuarioLoginPK usuarioLoginPK;
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    @Column(name = "e_mail")
    private String eMail;
    @Column(name = "pass")
    private String pass;
    @JoinColumn(name = "id_datos_cliente", referencedColumnName = "id_datos_cliente", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UsuarioDatos usuarioDatos;

    public UsuarioLogin() {
    }

    public UsuarioLogin(UsuarioLoginPK usuarioLoginPK) {
        this.usuarioLoginPK = usuarioLoginPK;
    }

    public UsuarioLogin(int idCliente, int idDatosCliente) {
        this.usuarioLoginPK = new UsuarioLoginPK(idCliente, idDatosCliente);
    }

    public UsuarioLoginPK getUsuarioLoginPK() {
        return usuarioLoginPK;
    }

    public void setUsuarioLoginPK(UsuarioLoginPK usuarioLoginPK) {
        this.usuarioLoginPK = usuarioLoginPK;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public UsuarioDatos getUsuarioDatos() {
        return usuarioDatos;
    }

    public void setUsuarioDatos(UsuarioDatos usuarioDatos) {
        this.usuarioDatos = usuarioDatos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioLoginPK != null ? usuarioLoginPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioLogin)) {
            return false;
        }
        UsuarioLogin other = (UsuarioLogin) object;
        if ((this.usuarioLoginPK == null && other.usuarioLoginPK != null) || (this.usuarioLoginPK != null && !this.usuarioLoginPK.equals(other.usuarioLoginPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.UsuarioLogin[ usuarioLoginPK=" + usuarioLoginPK + " ]";
    }
    
}
