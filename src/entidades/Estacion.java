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
@Table(name="tblestacion")

public class Estacion {
    
   
    private int id;
    private String nombreEstacion;
    private String domicilioEstacion;
    

    @Id
    @GeneratedValue
       
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    public String getDomicilioEstacion() {
        return domicilioEstacion;
    }

    public void setDomicilioEstacion(String domicilioEstacion) {
        this.domicilioEstacion = domicilioEstacion;
    }


    
}
