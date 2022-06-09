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
public class Empresa {
    private String nombre;
    private Edificio [] edificios;
    private Vehiculo[] vehiculos;
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalBienes;
    
    public void establecerNombre(String m){
        nombre = m;
    }
    
    public void establecerEdificios(Edificio[] m){
        edificios = m;
    }
    
    public void establecerVehiculos(Vehiculo[] v){
        vehiculos = v;
    }
    
    public void establecerCostoBienesInmuebles(){
        double suma = 0;
        for (int i = 0; i < obtenerEdificios().length; i++) { // o edifiios.length, es lo mismo
            suma += edificios[i].obtenerCosto();
        }
        
        costoBienesInmuebles = suma;
    }
    
    public void establecerCostoVehiculos(){
        double suma = 0;
        for (int i = 0; i < obtenerVehiculos().length; i++) { // o edifiios.length, es lo mismo
            suma += vehiculos[i].obtenerCosto();
        }
        
        costoVehiculos = suma;
    }
    
    public void establecerTotalBienes(){
        costoTotalBienes = costoBienesInmuebles + costoVehiculos;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Edificio[] obtenerEdificios(){
        return edificios;
    }
    
    public Vehiculo[] obtenerVehiculos(){
        return vehiculos;
    }
    
    public double obtenerCostoBienesInmuebles(){
        return costoBienesInmuebles;
    }
    
    public double obtenerCostoVehiculos(){
        return costoVehiculos;
    }
    
    public double obtenerTotalBienes(){
        return costoTotalBienes;
    }
    
    @Override
    
    public String toString(){
        String cadena = String.format("%s\nLista de Edificios \n",
                obtenerNombre());
        for (int i = 0; i < edificios.length; i++) {
            cadena = String.format("%s%s. %s (%.2f)\n", cadena, i + 1 ,
                                    edificios[i].obtenerNombre().toUpperCase(),
                                    edificios[i].obtenerCosto());
        }
        
        cadena = String.format("%sTotal de inmuebles: %.2f\n", cadena,
                                                 obtenerCostoBienesInmuebles());
        
        cadena = String.format("\n%s\nLista de Vehiculos\n", cadena);
        
        for (int i = 0; i < vehiculos.length; i++) {
            cadena = String.format("%s%s. %s, %s (%.2f)\n", cadena, i + 1 ,
                                    vehiculos[i].obtenerTipo(),
                                    vehiculos[i].obtenerPlaca().toUpperCase(),
                                    vehiculos[i].obtenerCosto());
        }
        cadena = String.format("%sTotal de inmuebles: %.2f\n", cadena,
                                                 obtenerCostoVehiculos());
        
        cadena = String.format("\n%s\nTotal de bienes: %.2f", cadena,
                                                 obtenerTotalBienes());
        
        return cadena;
    }
}
