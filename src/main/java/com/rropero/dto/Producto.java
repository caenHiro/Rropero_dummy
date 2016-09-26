/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rropero.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author INE
 */
@Entity
@Table(name = "producto", catalog = "rropero", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
    @NamedQuery(name = "Producto.findBySku", query = "SELECT p FROM Producto p WHERE p.sku = :sku"),
    @NamedQuery(name = "Producto.findByCategoria", query = "SELECT p FROM Producto p WHERE p.categoria = :categoria"),
    @NamedQuery(name = "Producto.findBySubCategoria", query = "SELECT p FROM Producto p WHERE p.subCategoria = :subCategoria"),
    @NamedQuery(name = "Producto.findBySubCategoriaArticulo", query = "SELECT p FROM Producto p WHERE p.subCategoriaArticulo = :subCategoriaArticulo"),
    @NamedQuery(name = "Producto.findByMarca", query = "SELECT p FROM Producto p WHERE p.marca = :marca"),
    @NamedQuery(name = "Producto.findByIdTalla", query = "SELECT p FROM Producto p WHERE p.idTalla = :idTalla"),
    @NamedQuery(name = "Producto.findByIdCliente", query = "SELECT p FROM Producto p WHERE p.idCliente = :idCliente"),
    @NamedQuery(name = "Producto.findByIdMaterial", query = "SELECT p FROM Producto p WHERE p.idMaterial = :idMaterial"),
    @NamedQuery(name = "Producto.findByEstadoPrenda", query = "SELECT p FROM Producto p WHERE p.estadoPrenda = :estadoPrenda"),
    @NamedQuery(name = "Producto.findByCategoriaEntrega", query = "SELECT p FROM Producto p WHERE p.categoriaEntrega = :categoriaEntrega"),
    @NamedQuery(name = "Producto.findByPrecio", query = "SELECT p FROM Producto p WHERE p.precio = :precio"),
    @NamedQuery(name = "Producto.findByFechaentrega", query = "SELECT p FROM Producto p WHERE p.fechaentrega = :fechaentrega"),
    @NamedQuery(name = "Producto.findByNombreArticulo", query = "SELECT p FROM Producto p WHERE p.nombreArticulo = :nombreArticulo"),
    @NamedQuery(name = "Producto.findByFechaventa", query = "SELECT p FROM Producto p WHERE p.fechaventa = :fechaventa"),
    @NamedQuery(name = "Producto.findByDescripcion", query = "SELECT p FROM Producto p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Producto.findByShopify", query = "SELECT p FROM Producto p WHERE p.shopify = :shopify"),
    @NamedQuery(name = "Producto.findByPrecioFinal", query = "SELECT p FROM Producto p WHERE p.precioFinal = :precioFinal"),
    @NamedQuery(name = "Producto.findByExistencia", query = "SELECT p FROM Producto p WHERE p.existencia = :existencia")})
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sku")
    private String sku;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "sub_categoria")
    private String subCategoria;
    @Column(name = "sub_categoria_articulo")
    private String subCategoriaArticulo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "id_talla")
    private Integer idTalla;
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "id_material")
    private Integer idMaterial;
    @Column(name = "estado_prenda")
    private String estadoPrenda;
    @Column(name = "categoria_entrega")
    private String categoriaEntrega;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;
    @Column(name = "fechaentrega")
    @Temporal(TemporalType.DATE)
    private Date fechaentrega;
    @Column(name = "nombre_articulo")
    private String nombreArticulo;
    @Column(name = "fechaventa")
    @Temporal(TemporalType.DATE)
    private Date fechaventa;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "shopify")
    private Boolean shopify;
    @Column(name = "precio_final")
    private Double precioFinal;
    @Column(name = "existencia")
    private Integer existencia;

    public Producto() {
    }

    public Producto(String sku) {
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getSubCategoriaArticulo() {
        return subCategoriaArticulo;
    }

    public void setSubCategoriaArticulo(String subCategoriaArticulo) {
        this.subCategoriaArticulo = subCategoriaArticulo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Integer idTalla) {
        this.idTalla = idTalla;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getEstadoPrenda() {
        return estadoPrenda;
    }

    public void setEstadoPrenda(String estadoPrenda) {
        this.estadoPrenda = estadoPrenda;
    }

    public String getCategoriaEntrega() {
        return categoriaEntrega;
    }

    public void setCategoriaEntrega(String categoriaEntrega) {
        this.categoriaEntrega = categoriaEntrega;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public Date getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(Date fechaventa) {
        this.fechaventa = fechaventa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getShopify() {
        return shopify;
    }

    public void setShopify(Boolean shopify) {
        this.shopify = shopify;
    }

    public Double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(Double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sku != null ? sku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.sku == null && other.sku != null) || (this.sku != null && !this.sku.equals(other.sku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rropero.dto.Producto[ sku=" + sku + " ]";
    }
    
}
