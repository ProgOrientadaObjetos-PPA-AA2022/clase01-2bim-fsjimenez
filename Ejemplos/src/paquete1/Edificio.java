/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Edificio {
    private String nombre;
    private double costo;
    
    public Edificio(String m){
        nombre = m;
    }
    
    public void establecerNombre(String m){
        nombre = m;
    }

    public void establecerCostos(double m){
        costo = m;
    }
    
    public String obtenerNombre(){
        return nombre;
    }    
   
    public double obtenerCosto(){
        return costo;
    }    
    
    @Override
    
    public String toString(){
        String cadena = String.format("Edificio de nombre %s, "
                + "tiene un costo de $%.2f", nombre, costo);
        return cadena;
    }
}
