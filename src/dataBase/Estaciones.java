/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import entidades.HibernateUtil;
import entidades.Estacion;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author EduardoHumberto
 */
public class Estaciones {
    
  private String nomE;
  private int idE;
  
    
   private Estacion es = new Estacion();
    
    public List<Estacion> obtenerTodos( int pos) {
        List<Estacion> estacion = new ArrayList<Estacion>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Estacion> criteria = builder.createQuery(Estacion.class);
            criteria.from(Estacion.class);
            estacion = session.createQuery(criteria).getResultList();
            for (Estacion i : estacion) {
             //   System.out.println(i.getNombre());
            }
            session.close();
        } catch (Exception e) {
        }
        return estacion;
    }
    
    
    public int obteneridE(){//recupera el id de la estacion seleccionada
        Session session = HibernateUtil.getSessionFactory().openSession();
        
//       Estacion profesor = (Estacion) session.createQuery("SELECT p FROM Estacion p WHERE id="+i).uniqueResult();
//System.out.println("Profesor con Id 1001=" +  profesor.getNombreEstacion());

//Estacion profesor = (Estacion) session.createQuery("SELECT p FROM Estacion p WHERE p.nombreEstacion ='Centro'").uniqueResult();
//System.out.println("Profesor con Id 1001=" + profesor.getId());
 


//Estacion profesor = (Estacion) session.createQuery("SELECT p FROM Estacion p WHERE p.nombreEstacion='"+idE+"'").uniqueResult();
//System.out.println("Profesor con Id 1001=" + profesor.getId()); este es el chilo
    Estacion est = (Estacion) session.createQuery("SELECT p FROM Estacion p WHERE p.nombreEstacion='"+nomE+"'").uniqueResult();
//System.out.println("Profesor con Id 1001=" + profesor.getId());   

return est.getId();
    }
    
    public String obtenerNombreE (){//recupera el nombre de la estacion selecionada
        Session session = HibernateUtil.getSessionFactory().openSession();
           Estacion est = (Estacion) session.createQuery("SELECT p FROM Estacion p WHERE id="+idE).uniqueResult();
 
return est.getNombreEstacion();
}
    
       
    
    public void guardar(Estacion estaciones){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(estaciones);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar guardar el objeto");
        }
    }
    
    public void eliminar(Estacion estaciones){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(estaciones);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar eliminar el objeto");
        }
    }
    
   public void eliminar1(int pos) {
        Estacion c = new Estacion();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            c = (Estacion) session.get(Estacion.class, obtenerTodos(pos).get(pos).getId());
            
            session.delete(c);
            session.getTransaction().commit();
            session.close();
        } catch (Exception ex) {
            System.out.println("Ocurrió un error al intentar obtener registros");
        }
    }


    
  public void modificar(int pos,String nom,String ubi){
        
         Estacion e = new Estacion();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            e = (Estacion) session.get(Estacion.class, obtenerTodos(pos).get(pos).getId());
            e.setNombreEstacion(nom);
            e.setDomicilioEstacion(ubi);
            session.update(e);
            session.getTransaction().commit();
            session.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Ocurrió un error, por favor revisa los datos");
        }
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public Estacion getEs() {
        return es;
    }

    public void setEs(Estacion es) {
        this.es = es;
    }

    public int getIdE() {
        return idE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }
    
}
