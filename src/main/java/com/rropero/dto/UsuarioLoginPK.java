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
public class UsuarioLoginPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private int idCliente;
    @Basic(optional = false)
    @Column(name = "id_datos_cliente")
    private int idDatosCliente;

    public UsuarioLoginPK() {
    }

    public UsuarioLoginPK(int idCliente, int idDatosCliente) {
        this.idCliente = idCliente;
        this.idDatosCliente = idDatosCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdDatosCliente() {
        return idDatosCliente;
    }

    public void setIdDatosCliente(int idDatosCliente) {
        this.idDatosCliente = idDatosCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCliente;
        hash += (int) idDatosCliente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioLoginPK)) {
            return false;
        }
        UsuarioLoginPK other = (UsuarioLoginPK) object;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (this.idDatosCliente != other.idDatosCliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.UsuarioLoginPK[ idCliente=" + idCliente + ", idDatosCliente=" + idDatosCliente + " ]";
    }
    
}
