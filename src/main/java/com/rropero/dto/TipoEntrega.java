package com.rropero.dto;
// Generated 17/09/2016 03:09:58 PM by Hibernate Tools 4.3.1



/**
 * TipoEntrega generated by hbm2java
 */
public class TipoEntrega  implements java.io.Serializable {


     private String categoriaEntrega;
     private String categoriaEntregaAbrev;

    public TipoEntrega() {
    }

	
    public TipoEntrega(String categoriaEntrega) {
        this.categoriaEntrega = categoriaEntrega;
    }
    public TipoEntrega(String categoriaEntrega, String categoriaEntregaAbrev) {
       this.categoriaEntrega = categoriaEntrega;
       this.categoriaEntregaAbrev = categoriaEntregaAbrev;
    }
   
    public String getCategoriaEntrega() {
        return this.categoriaEntrega;
    }
    
    public void setCategoriaEntrega(String categoriaEntrega) {
        this.categoriaEntrega = categoriaEntrega;
    }
    public String getCategoriaEntregaAbrev() {
        return this.categoriaEntregaAbrev;
    }
    
    public void setCategoriaEntregaAbrev(String categoriaEntregaAbrev) {
        this.categoriaEntregaAbrev = categoriaEntregaAbrev;
    }




}


