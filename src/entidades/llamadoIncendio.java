
package entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tblincendio")
public class llamadoIncendio {
    private int id;
    private String tipoIncendio;
    private Date fechaIncendio;
    private String direccionIncendio;
    private String reportanteIncendio;
    private String danoIncendio;
    private String herramientaIncendio;
    private int numUnidad;
    private String nombreOperador;
    private String descripcionIncendio;
    private String tipoApoyo;

    
     @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    public Date getFechaIncendio() {
        return fechaIncendio;
    }

    public void setFechaIncendio(Date fechaIncendio) {
        this.fechaIncendio = fechaIncendio;
    }

    public String getDireccionIncendio() {
        return direccionIncendio;
    }

    public void setDireccionIncendio(String direccionIncendio) {
        this.direccionIncendio = direccionIncendio;
    }

    public String getReportanteIncendio() {
        return reportanteIncendio;
    }

    public void setReportanteIncendio(String reportanteIncendio) {
        this.reportanteIncendio = reportanteIncendio;
    }

    public String getDanoIncendio() {
        return danoIncendio;
    }

    public void setDanoIncendio(String danoIncendio) {
        this.danoIncendio = danoIncendio;
    }

    public String getHerramientaIncendio() {
        return herramientaIncendio;
    }

    public void setHerramientaIncendio(String herramientaIncendio) {
        this.herramientaIncendio = herramientaIncendio;
    }

    

   

    public String getDescripcionIncendio() {
        return descripcionIncendio;
    }

    public void setDescripcionIncendio(String descripcionIncendio) {
        this.descripcionIncendio = descripcionIncendio;
    }

    public String getTipoIncendio() {
        return tipoIncendio;
    }

    public void setTipoIncendio(String tipoIncendio) {
        this.tipoIncendio = tipoIncendio;
    }

    public String getTipoApoyo() {
        return tipoApoyo;
    }

    public void setTipoApoyo(String tipoApoyo) {
        this.tipoApoyo = tipoApoyo;
    }

    public int getNumUnidad() {
        return numUnidad;
    }

    public void setNumUnidad(int numUnidad) {
        this.numUnidad = numUnidad;
    }

    public String getNombreOperador() {
        return nombreOperador;
    }

    public void setNombreOperador(String nombreOperador) {
        this.nombreOperador = nombreOperador;
    }

    
    
    
    
    
    
}
