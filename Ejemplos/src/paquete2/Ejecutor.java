/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Edificio edf1 = new Edificio("Edficio Central");
        Edificio edf2 = new Edificio("Edficio Norte");
        Edificio edf3 = new Edificio("Edficio Sur");
        Edificio edf4 = new Edificio("Edficio Secundario");
        
        edf1.establecerCostos(20000);
        edf2.establecerCostos(30000);
        edf3.establecerCostos(10000);
        edf4.establecerCostos(5000);
        
        
        Vehiculo v1 = new Vehiculo(10000, "Auto", "LBB0011");
        Vehiculo v2 = new Vehiculo(20000, "Camioneta", "LCB0011");
        Vehiculo v3 = new Vehiculo(6000, "Auto", "LBD0011");
        Vehiculo v4 = new Vehiculo(10000, "Camioneta", "LCC0011");
        Vehiculo v5 = new Vehiculo(25000, "Camioneta", "LCD0011");
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio[] listaEdificios = {edf1, edf2, edf3, edf4};
        Vehiculo[] listaVehiculos = {v1, v2, v3, v4, v5};
        //double c = listaEdificios[2].obtenerCosto();        
        //System.out.println(c);
        
        Empresa empr1 = new Empresa();
        empr1.establecerNombre("Empresa de Hojas");
        empr1.establecerEdificios(listaEdificios);
        empr1.establecerCostoBienesInmuebles();
        empr1.establecerVehiculos(listaVehiculos);
        empr1.establecerCostoVehiculos();
        empr1.establecerTotalBienes();
        
        //System.out.println(empr1);
        
        
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        
        // Imprimir el costo de los bienes inmuebles de la empresa
        
        System.out.printf("%.2f\n", empr1.obtenerCostoBienesInmuebles());
        System.out.println(empr1);
    }
}
