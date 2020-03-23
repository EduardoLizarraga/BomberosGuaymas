/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author EduardoHumberto
 */
public enum tipoIncendio {
    CASA,
    VEHICULO,
    NEGOCIO,
    MALEZA;
    
    private int tipoIncendio;

    public int getTipoIncendio() {
        return tipoIncendio;
    }

    public void setTipoIncendio(int tipoIncendio) {
        this.tipoIncendio = tipoIncendio;
    }
    
    
    
    
    
    
}
