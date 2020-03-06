/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 *
 * @author EduardoHumberto
 */

@Entity
@Table(name="tblpersonal")
public class Personal {
    
    private int id;
    private String nombrePersonal;
    private String apellidoPersonal;
    private int tipoPersonal ;
    private int idEstacion;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePersonal() {
        return nombrePersonal;
    }

    public void setNombrePersonal(String nombrePersonal) {
        this.nombrePersonal = nombrePersonal;
    }

    public String getApellidoPersonal() {
        return apellidoPersonal;
    }

    public void setApellidoPersonal(String apellidoPersonal) {
        this.apellidoPersonal = apellidoPersonal;
    }

  

    public int getIdEstacion() {
        return idEstacion;
    }

    public void setIdEstacion(int idEstacion) {
        this.idEstacion = idEstacion;
    }

    public int getTipoPersonal() {
        return tipoPersonal;
    }

    public void setTipoPersonal(int tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }
    
    
   
    
}
