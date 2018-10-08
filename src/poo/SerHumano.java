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
public class SerHumano extends SerVivo{

   private String idioma;
   private String caracteristicas;

    public SerHumano(String idioma, String caracteristicas, int tiempoDevida) {
        super(tiempoDevida);
        this.idioma = idioma;
        this.caracteristicas = caracteristicas;
    }

   
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
    public void caracteristicaHumano(int caracteristica)
    {
            }

    
}
