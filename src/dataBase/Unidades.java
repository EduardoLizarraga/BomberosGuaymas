/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

/**
 *
 * @author EduardoHumberto
 * 
 */
import entidades.HibernateUtil;
import entidades.Unidad;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
public class Unidades {
    
    private int idU;
    private int numU;
    public List<Unidad> obtenerTodos(int pos) {
     List<Unidad> unidad = new ArrayList<Unidad>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Unidad> criteria = builder.createQuery(Unidad.class);
            criteria.from(Unidad.class);
            unidad = session.createQuery(criteria).getResultList();
            for (Unidad i : unidad) {
             //   System.out.println(i.getNombre());
            }
            session.close();
        } catch (Exception e) {
        }
        return unidad;
    }
    
      public int obteneridU(){//recupera el id de la estacion seleccionada
        Session session = HibernateUtil.getSessionFactory().openSession();
        

        Unidad unidad = (Unidad) session.createQuery("SELECT p FROM Unidad p WHERE p.numeroUnidad="+numU).uniqueResult();
 return unidad.getId();
    }
    
      public int obtenernumU(){//recupera el id de la estacion seleccionada
        Session session = HibernateUtil.getSessionFactory().openSession();
        

        Unidad unidad = (Unidad) session.createQuery("SELECT p FROM Unidad p WHERE id="+idU).uniqueResult();
 return unidad.getNumeroUnidad();
    }
     
    
    public void guardar(Unidad unidad){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(unidad);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar guardar el objeto");
        }
    }
    
       public void eliminar(Unidad unidad){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(unidad);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar eliminar el objeto");
        }
    }
       
       public void modificar(Unidad unidad){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(unidad);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar eliminar el objeto");
        }
    }

    public int getUdU() {
        return idU;
    }

    public void setUdU(int udU) {
        this.idU = udU;
    }

    public int getNumU() {
        return numU;
    }

    public void setNumU(int numU) {
        this.numU = numU;
    }
}
