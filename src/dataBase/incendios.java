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
    public static int id;
    private String tipo;
    
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
         
         
          public List<llamadoIncendio> tipoIncendio(int pos) {
        List<llamadoIncendio> llamado = new ArrayList<llamadoIncendio>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<llamadoIncendio> criteria = builder.createQuery(llamadoIncendio.class);
            criteria.from(llamadoIncendio.class);
            llamado = session.createQuery("SELECT p FROM llamadoIncendio p WHERE p.tipoIncendio LIKE'%"+tipo+"'").getResultList();
            for (llamadoIncendio i : llamado) {
             //   System.out.println(i.getNombre());
            }
            session.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"valio queso");
        }
        return llamado;
    }
          
          public List<llamadoIncendio> tipoFecha(int pos) {
        List<llamadoIncendio> llamado = new ArrayList<llamadoIncendio>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<llamadoIncendio> criteria = builder.createQuery(llamadoIncendio.class);
            criteria.from(llamadoIncendio.class);
            llamado = session.createQuery("SELECT p FROM llamadoIncendio p WHERE p.tipoIncendio LIKE'%"+tipo+"' and p.fechaIncendio LIKE'%"+fecha+"__%' ").getResultList();
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
      
      
       
       
      
  
       public void modificar(String tipoI,String dir,String prop, String dano, int unidad,
              String nom,String des, String apoyo){
        llamadoIncendio c = new llamadoIncendio();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            c = (llamadoIncendio) session.createQuery("SELECT p FROM llamadoIncendio p WHERE p.id="+id).uniqueResult();
            
          c.setTipoIncendio(tipoI);
          c.setDireccionIncendio(dir);
          c.setPropietario(prop);
          c.setDanoIncendio(dano);
          c.setNumUnidad(unidad);
          c.setNombreOperador(nom);
          c.setDescripcionIncendio(des);
          c.setTipoApoyo(apoyo);
            session.update(c);
            session.getTransaction().commit();
            session.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Ocurrió un error, por favor revisa los datos");
        }
    }
       
       public void eliminar1() {
        llamadoIncendio c = new llamadoIncendio();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            c = (llamadoIncendio) session.createQuery("SELECT p FROM llamadoIncendio p WHERE p.id="+id).uniqueResult();
            
            session.delete(c);
            session.getTransaction().commit();
            session.close();
        } catch (Exception ex) {
            System.out.println("Ocurrió un error al intentar obtener registros");
        }
    }
    public  llamadoIncendio enviar1 () {
   
        llamadoIncendio c = new llamadoIncendio();
        try {
          Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            c = (llamadoIncendio) session.createQuery("SELECT p FROM llamadoIncendio p WHERE p.id="+id).uniqueResult();
            
            session.close();
        } catch (Exception e) {
            
        }
        return c;
        
        
    }
        
        

       
        

    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    
}
