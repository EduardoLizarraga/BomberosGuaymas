
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
    private int tipoIncendio;
    private Date fechaIncendio;
    private String direccionIncendio;
    private String reportanteIncendio;
    private String danoIncendio;
    private String herramientaIncendio;
    private int idUnidad;
    private int idBombero;
    private String descripcionIncendio;
    private int tipoApoyo;

    
     @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipoIncendio() {
        return tipoIncendio;
    }

    public void setTipoIncendio(int tipoIncendio) {
        this.tipoIncendio = tipoIncendio;
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

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    public int getIdBombero() {
        return idBombero;
    }

    public void setIdBombero(int idBombero) {
        this.idBombero = idBombero;
    }

    public String getDescripcionIncendio() {
        return descripcionIncendio;
    }

    public void setDescripcionIncendio(String descripcionIncendio) {
        this.descripcionIncendio = descripcionIncendio;
    }

    public int getTipoApoyo() {
        return tipoApoyo;
    }

    public void setTipoApoyo(int tipoApoyo) {
        this.tipoApoyo = tipoApoyo;
    }
    
    
    
    
    
}
