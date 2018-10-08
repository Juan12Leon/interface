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
public class Animal extends SerVivo {
    
    private int especie;

    public Animal(int especie, int tiempoDevida) {
        super(tiempoDevida);
        this.especie = especie;
    }

    public int getEspecie() {
        return especie;
    }

    public void setEspecie(int especie) {
        this.especie = especie;
    }
    
    
    
}
