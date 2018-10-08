/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author USUARIO
 */    
    public class Main {

public static void main(String args[]){
 
 Animal perro = new Animal(0, 0);
 Planta arbol= new Planta("hoja", 0);
 SerHumano juan = new SerHumano("idioma", "caracteristicas", 0);
 
  perro.getEspecie();
  System.out.println("--------------");
  
  arbol.getTiempoDevida();
  System.out.println("--------------");
  
  juan.getIdioma();
  System.out.println("--------------");
             

    

