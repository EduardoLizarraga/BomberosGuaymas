/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import entidades.HibernateUtil;
import entidades.llamadoIncendio;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;

/**
 *
 * @author EduardoHumberto
 */
public class incendios {
    
      public List<llamadoIncendio> obtenerTodos(int pos) {
        List<llamadoIncendio> incendio = new ArrayList<llamadoIncendio>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<llamadoIncendio> criteria = builder.createQuery(llamadoIncendio.class);
            criteria.from(llamadoIncendio.class);
            incendio = session.createQuery(criteria).getResultList();
            for (llamadoIncendio i : incendio) {
             //   System.out.println(i.getNombre());
            }
            session.close();
        } catch (Exception e) {
        }
        return incendio;
    }
      
      
      public void guardar(llamadoIncendio incendios){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(incendios);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar guardar el objeto");
        }
    }
      
      
       public void eliminar(llamadoIncendio incendios){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(incendios);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar eliminar el objeto");
        }
    }
       
       
        public void modificar(llamadoIncendio incendios){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(incendios);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar eliminar el objeto");
        }
    }
    
}
