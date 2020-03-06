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
public enum TipoPersonal {
    
    DIRECTOR,
    SUPERVISOR,
    BOMBERO;
    
    private int TipoPersonal;

    public int getTipoPersonal() {
        return TipoPersonal;
    }

    public void setTipoPersonal(int TipoPersonal) {
        this.TipoPersonal = TipoPersonal;
    }

    
    
    
}
