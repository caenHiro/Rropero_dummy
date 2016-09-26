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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tallas", catalog = "rropero", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tallas.findAll", query = "SELECT t FROM Tallas t"),
    @NamedQuery(name = "Tallas.findByIdTalla", query = "SELECT t FROM Tallas t WHERE t.idTalla = :idTalla"),
    @NamedQuery(name = "Tallas.findByCategoria", query = "SELECT t FROM Tallas t WHERE t.categoria = :categoria"),
    @NamedQuery(name = "Tallas.findBySubCategoriaArticulo", query = "SELECT t FROM Tallas t WHERE t.subCategoriaArticulo = :subCategoriaArticulo"),
    @NamedQuery(name = "Tallas.findByUs", query = "SELECT t FROM Tallas t WHERE t.us = :us"),
    @NamedQuery(name = "Tallas.findByUsDesc", query = "SELECT t FROM Tallas t WHERE t.usDesc = :usDesc"),
    @NamedQuery(name = "Tallas.findByEur", query = "SELECT t FROM Tallas t WHERE t.eur = :eur"),
    @NamedQuery(name = "Tallas.findByEurDesc", query = "SELECT t FROM Tallas t WHERE t.eurDesc = :eurDesc"),
    @NamedQuery(name = "Tallas.findByUk", query = "SELECT t FROM Tallas t WHERE t.uk = :uk"),
    @NamedQuery(name = "Tallas.findByMex", query = "SELECT t FROM Tallas t WHERE t.mex = :mex"),
    @NamedQuery(name = "Tallas.findByMexDesc", query = "SELECT t FROM Tallas t WHERE t.mexDesc = :mexDesc"),
    @NamedQuery(name = "Tallas.findByIt", query = "SELECT t FROM Tallas t WHERE t.it = :it"),
    @NamedQuery(name = "Tallas.findByAus", query = "SELECT t FROM Tallas t WHERE t.aus = :aus"),
    @NamedQuery(name = "Tallas.findByJap", query = "SELECT t FROM Tallas t WHERE t.jap = :jap"),
    @NamedQuery(name = "Tallas.findByChi", query = "SELECT t FROM Tallas t WHERE t.chi = :chi"),
    @NamedQuery(name = "Tallas.findByPecho", query = "SELECT t FROM Tallas t WHERE t.pecho = :pecho"),
    @NamedQuery(name = "Tallas.findByCintura", query = "SELECT t FROM Tallas t WHERE t.cintura = :cintura"),
    @NamedQuery(name = "Tallas.findByCadera", query = "SELECT t FROM Tallas t WHERE t.cadera = :cadera"),
    @NamedQuery(name = "Tallas.findByPulgadas", query = "SELECT t FROM Tallas t WHERE t.pulgadas = :pulgadas"),
    @NamedQuery(name = "Tallas.findByCm", query = "SELECT t FROM Tallas t WHERE t.cm = :cm")})
public class Tallas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_talla")
    private Integer idTalla;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "sub_categoria_articulo")
    private String subCategoriaArticulo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "us")
    private Double us;
    @Column(name = "us_desc")
    private String usDesc;
    @Column(name = "eur")
    private Double eur;
    @Column(name = "eur_desc")
    private String eurDesc;
    @Column(name = "uk")
    private Double uk;
    @Column(name = "mex")
    private Double mex;
    @Column(name = "mex_desc")
    private String mexDesc;
    @Column(name = "it")
    private Double it;
    @Column(name = "aus")
    private Double aus;
    @Column(name = "jap")
    private Double jap;
    @Column(name = "chi")
    private Double chi;
    @Column(name = "pecho")
    private Double pecho;
    @Column(name = "cintura")
    private Double cintura;
    @Column(name = "cadera")
    private Double cadera;
    @Column(name = "pulgadas")
    private Double pulgadas;
    @Column(name = "cm")
    private Double cm;

    public Tallas() {
    }

    public Tallas(Integer idTalla) {
        this.idTalla = idTalla;
    }

    public Integer getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Integer idTalla) {
        this.idTalla = idTalla;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoriaArticulo() {
        return subCategoriaArticulo;
    }

    public void setSubCategoriaArticulo(String subCategoriaArticulo) {
        this.subCategoriaArticulo = subCategoriaArticulo;
    }

    public Double getUs() {
        return us;
    }

    public void setUs(Double us) {
        this.us = us;
    }

    public String getUsDesc() {
        return usDesc;
    }

    public void setUsDesc(String usDesc) {
        this.usDesc = usDesc;
    }

    public Double getEur() {
        return eur;
    }

    public void setEur(Double eur) {
        this.eur = eur;
    }

    public String getEurDesc() {
        return eurDesc;
    }

    public void setEurDesc(String eurDesc) {
        this.eurDesc = eurDesc;
    }

    public Double getUk() {
        return uk;
    }

    public void setUk(Double uk) {
        this.uk = uk;
    }

    public Double getMex() {
        return mex;
    }

    public void setMex(Double mex) {
        this.mex = mex;
    }

    public String getMexDesc() {
        return mexDesc;
    }

    public void setMexDesc(String mexDesc) {
        this.mexDesc = mexDesc;
    }

    public Double getIt() {
        return it;
    }

    public void setIt(Double it) {
        this.it = it;
    }

    public Double getAus() {
        return aus;
    }

    public void setAus(Double aus) {
        this.aus = aus;
    }

    public Double getJap() {
        return jap;
    }

    public void setJap(Double jap) {
        this.jap = jap;
    }

    public Double getChi() {
        return chi;
    }

    public void setChi(Double chi) {
        this.chi = chi;
    }

    public Double getPecho() {
        return pecho;
    }

    public void setPecho(Double pecho) {
        this.pecho = pecho;
    }

    public Double getCintura() {
        return cintura;
    }

    public void setCintura(Double cintura) {
        this.cintura = cintura;
    }

    public Double getCadera() {
        return cadera;
    }

    public void setCadera(Double cadera) {
        this.cadera = cadera;
    }

    public Double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Double getCm() {
        return cm;
    }

    public void setCm(Double cm) {
        this.cm = cm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTalla != null ? idTalla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tallas)) {
            return false;
        }
        Tallas other = (Tallas) object;
        if ((this.idTalla == null && other.idTalla != null) || (this.idTalla != null && !this.idTalla.equals(other.idTalla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.Tallas[ idTalla=" + idTalla + " ]";
    }
    
}
