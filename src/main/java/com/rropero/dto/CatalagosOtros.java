package com.rropero.dto;
// Generated 17/09/2016 03:09:58 PM by Hibernate Tools 4.3.1



/**
 * CatalagosOtros generated by hbm2java
 */
public class CatalagosOtros  implements java.io.Serializable {


     private CatalagosOtrosId id;
     private String otroDesc;

    public CatalagosOtros() {
    }

	
    public CatalagosOtros(CatalagosOtrosId id) {
        this.id = id;
    }
    public CatalagosOtros(CatalagosOtrosId id, String otroDesc) {
       this.id = id;
       this.otroDesc = otroDesc;
    }
   
    public CatalagosOtrosId getId() {
        return this.id;
    }
    
    public void setId(CatalagosOtrosId id) {
        this.id = id;
    }
    public String getOtroDesc() {
        return this.otroDesc;
    }
    
    public void setOtroDesc(String otroDesc) {
        this.otroDesc = otroDesc;
    }




}


