package com.rropero.daoImpl;

import com.rropero.dao.ProductoDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pilar Hdez
 */
@Scope("prototype")
@Repository("productoDao")
public class ProductoDaoImpl implements ProductoDao {
    
}
