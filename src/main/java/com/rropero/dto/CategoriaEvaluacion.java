package com.rropero.dto;
// Generated 12/09/2016 11:51:43 PM by Hibernate Tools 4.3.1



/**
 * CategoriaEvaluacion generated by hbm2java
 */
public class CategoriaEvaluacion  implements java.io.Serializable {


     private String marca;
     private String categoriaMarca;

    public CategoriaEvaluacion() {
    }

	
    public CategoriaEvaluacion(String marca) {
        this.marca = marca;
    }
    public CategoriaEvaluacion(String marca, String categoriaMarca) {
       this.marca = marca;
       this.categoriaMarca = categoriaMarca;
    }
   
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCategoriaMarca() {
        return this.categoriaMarca;
    }
    
    public void setCategoriaMarca(String categoriaMarca) {
        this.categoriaMarca = categoriaMarca;
    }




}


