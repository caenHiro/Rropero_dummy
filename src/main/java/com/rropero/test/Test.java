
package com.rropero.test;

import com.rropero.daoImpl.CategoriasPrincipalesDaoHibernateImpl;
import com.rropero.dto.CategoriasPrincipales;
import com.rropero.dto.CategoriasPrincipalesPK;

/**
 *
 * @author caen
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CategoriasPrincipales cp = new CategoriasPrincipales();
        CategoriasPrincipalesPK cpk = new CategoriasPrincipalesPK();
        CategoriasPrincipalesDaoHibernateImpl conector = new CategoriasPrincipalesDaoHibernateImpl();
        cpk.setCategoria("caen");
        cpk.setSubCategoria("preu");
        cpk.setSubCategoriaArticulo("hiro");
        cp.setCategoriasPrincipalesPK(cpk);
        cp.setCategoriaAbrev("aa");
        cp.setSubCategoriaAbrev("bb");
        cp.setSubCategoriaArticuloAbrev("cc");
        cp.setPesoAmbiental(10.5);
        cp.setPesoEnvio(11.3);
        
        conector.addCategoriasPrincipales(cp);
        
    }
    
}
