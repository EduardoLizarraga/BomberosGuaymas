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
public enum tipoApoyo {
    AMBULANCIA,
    POLICIAM,
    POLICIAF;
    
    private int tipoApoyo;

    public int getTipoApoyo() {
        return tipoApoyo;
    }

    public void setTipoApoyo(int tipoApoyo) {
        this.tipoApoyo = tipoApoyo;
    }
    
    
    
    
}
