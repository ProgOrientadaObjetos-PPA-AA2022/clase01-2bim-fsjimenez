/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Usuario iTC
 */
public class Vehiculo {
    private double costo;
    private String tipo;
    private String placa;
    
    public Vehiculo(double c, String t, String p){
        costo = c;
        tipo = t;
        placa = p;
    }
    
    public double obtenerCosto(){
        return costo;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public String obtenerPlaca(){
        return placa;
    }
}
