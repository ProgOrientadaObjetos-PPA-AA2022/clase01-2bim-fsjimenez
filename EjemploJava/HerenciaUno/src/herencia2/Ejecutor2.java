/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        EstudianteDistancia e1 = new EstudianteDistancia();
        
        String nombres, apellidos, cedula;
        int edad, numeroAsignaturas;
        double costoAsignatura;
        
        System.out.println("Ingrese los nombres");
        nombres = entrada.nextLine();
        System.out.println("Ingrese los apellidos");
        apellidos = entrada.nextLine();
        System.out.println("Ingrese su número de cédula");
        cedula = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese el numero de asignaturas");
        numeroAsignaturas = entrada.nextInt();
        System.out.println("Ingrese el costo por asignatura");
        costoAsignatura = entrada.nextDouble();
        
        
        e1.establecerNombresEstudiante(nombres);
        e1.establecerApellidoEstudiante(apellidos);
        e1.establecerIdentificacionEstudiante(cedula);
        e1.establecerEdadEstudiante(edad);
        e1.establecerNumeroAsginaturas(numeroAsignaturas);
        e1.establecerCostoAsignatura(costoAsignatura);
        e1.calcularMatriculaDistancia();
        
        
        System.out.printf("%s\n", e1);
    }
}
