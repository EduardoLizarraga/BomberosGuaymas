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
    private static int id;
    
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
       
       public int obtener1(int pos){
           llamadoIncendio c = new llamadoIncendio();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            c = (llamadoIncendio) session.get(llamadoIncendio.class, obtenerTodos(pos).get(pos).getId());
            
          
            session.update(c);
            session.getTransaction().commit();
            session.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Ocurrió un error, por favor revisa los datos");
        }
        return pos;
           
       }
        public void modificar(int pos,String tipoI,String fecha,String dir,String tel, String dano, int unidad,
                String nom,String des, String apoyo){
        
         llamadoIncendio c = new llamadoIncendio();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            c = (llamadoIncendio) session.get(llamadoIncendio.class, obtenerTodos(pos).get(pos).getId());
            
          
            session.update(c);
            session.getTransaction().commit();
            session.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Ocurrió un error, por favor revisa los datos");
        }
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
    
}
