/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author alumno
 */
public class Planta extends SerVivo {
    
    private String hoja;

    public Planta(String hoja, int mostrarVida) {
        super(mostrarVida);
        this.hoja = hoja;
    }
    

    public String getHoja() {
        return hoja;
    }

    public void setHoja(String hoja) {
        this.hoja = hoja;
    }
    
    
}
