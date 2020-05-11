package dataBase;
import entidades.HibernateUtil;
import entidades.llamadoIncendio;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author EduardoHumberto
 */
public class incendios {
    private String fecha;
    
      public List<llamadoIncendio> obtenerTodos(int pos) {
        List<llamadoIncendio> incendio = new ArrayList<llamadoIncendio>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<llamadoIncendio> criteria = builder.createQuery(llamadoIncendio.class);
            criteria.from(llamadoIncendio.class);
            incendio = session.createQuery(criteria).getResultList();
            for (llamadoIncendio i : incendio) {
             
            }
            session.close();
        } catch (Exception e) {
            
        }
        return incendio;
    }
      
         public List<llamadoIncendio> obtenerFecha(int pos) {
        List<llamadoIncendio> llamado = new ArrayList<llamadoIncendio>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<llamadoIncendio> criteria = builder.createQuery(llamadoIncendio.class);
            criteria.from(llamadoIncendio.class);
            llamado = session.createQuery("SELECT p FROM llamadoIncendio p WHERE p.fechaIncendio LIKE'%"+fecha+"__%'").getResultList();
            for (llamadoIncendio i : llamado) {
             //   System.out.println(i.getNombre());
            }
            session.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"valio queso");
        }
        return llamado;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
