/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;


import entidades.HibernateUtil;
import entidades.Personal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;

/**
 *
 * @author EduardoHumberto
 */


public class Personals {
    
 private String nombreP;
private int idP;

    public List<Personal> obtenerTodos(int pos) {
        List<Personal> personal = new ArrayList<Personal>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Personal> criteria = builder.createQuery(Personal.class);
            criteria.from(Personal.class);
            personal = session.createQuery(criteria).getResultList();
            for (Personal i : personal) {
             //   System.out.println(i.getNombre());
            }
            session.close();
        } catch (Exception e) {
        }
        return personal;
    }
    
    public int obteneridP(){//recupera el id de la estacion seleccionada
        Session session = HibernateUtil.getSessionFactory().openSession();
        

        Personal per = (Personal) session.createQuery("SELECT p FROM Personal p WHERE p.apellidoPersonal='"+nombreP+"'");
 return per.getId();
    }
    
     public String obtenerNombreP (){//recupera el nombre de la estacion selecionada
        Session session = HibernateUtil.getSessionFactory().openSession();
           Personal per = (Personal) session.createQuery("SELECT p FROM Personal p WHERE id="+idP).uniqueResult();
 
return per.getNombrePersonal();
}
    
    
    public void guardar(Personal Personals){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(Personals);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar guardar el objeto");
        }
    }
    
    public void eliminar(Personal Personals){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(Personals);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar eliminar el objeto");
        }
    }
    
    public void eliminar1(int pos) {
        Personal c = new Personal();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            c = (Personal) session.get(Personal.class, obtenerTodos(pos).get(pos).getId());
            
            session.delete(c);
            session.getTransaction().commit();
            session.close();
        } catch (Exception ex) {
            System.out.println("Ocurrió un error al intentar obtener registros");
        }
    }
    public void modificar(Personal Personals){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(Personals);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar eliminar el objeto");
        }
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }
}
