
package com.rropero.daoImpl;

import com.rropero.dao.CategoriasPrincipalesDaoHibernate;
import com.rropero.dto.CategoriasPrincipales;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author Caen
 */
public class CategoriasPrincipalesDaoHibernateImpl implements CategoriasPrincipalesDaoHibernate{

    private SessionFactory sessionFactory;
	
    public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
    
    @Override
    public void addCategoriasPrincipales(CategoriasPrincipales p) {
        Session session = this.sessionFactory.getCurrentSession();
	session.persist(p);
	System.out.println("Person saved successfully, Person Details="+p);
    }

    @Override
    public void updateCategoriasPrincipales(CategoriasPrincipales p) {
        Session session = this.sessionFactory.getCurrentSession();
	session.update(p);
	System.out.println("Person updated successfully, Person Details="+p);
    }

    @Override
    public List<CategoriasPrincipales> listCategoriasPrincipales() {
       Session session = this.sessionFactory.getCurrentSession();
	List<CategoriasPrincipales> personsList = session.createQuery("from categorias_principales").list();
	for(CategoriasPrincipales p : personsList){
		          System.out.println("CategoriasPrincipales List::"+p);
	}
	return personsList;
    }

    @Override
    public void removePerson(CategoriasPrincipales p) {
       Session session = this.sessionFactory.getCurrentSession();
	if(null != p){
		session.delete(p);
	}
    System.out.println("CategoriasPrincipales deleted successfully, person details="+p);
    }
    
}
