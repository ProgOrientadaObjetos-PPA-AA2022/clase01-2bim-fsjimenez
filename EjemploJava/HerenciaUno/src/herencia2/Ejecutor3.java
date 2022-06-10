/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import herencia1.*;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombres, apellidos, cedula;
        int edad, numeroAsignaturas, numeroCreditos;
        double costoAsignatura, costoCredito;
        int opc;

        System.out.println("Ingresar Estudiante Distancia  [1]");
        System.out.println("Ingresar Estudiante Presencial [2]");
        opc = entrada.nextInt();

        if (opc != 1 && opc != 2) {
            System.out.println("Numero no valido");
        } else {
            System.out.println("Ingrese los nombres");
            entrada.nextLine();
            nombres = entrada.nextLine();
            System.out.println("Ingrese los apellidos");
            apellidos = entrada.nextLine();
            System.out.println("Ingrese su número de cédula");
            cedula = entrada.nextLine();
            System.out.println("Ingrese su edad");
            edad = entrada.nextInt();

            if (opc == 1) {
                EstudianteDistancia e1 = new EstudianteDistancia();
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
            } else {
                if (opc == 2) {
                    EstudiantePresencial eP = new EstudiantePresencial();
                    System.out.println("Ingrese el numero de creditos");
                    numeroCreditos = entrada.nextInt();
                    System.out.println("Ingrese el costo por asignatura");
                    costoCredito = entrada.nextDouble();

                    eP.establecerNombresEstudiante(nombres);
                    eP.establecerApellidoEstudiante(apellidos);
                    eP.establecerIdentificacionEstudiante(cedula);
                    eP.establecerEdadEstudiante(edad);
                    eP.establecerNumeroCreditos(numeroCreditos);
                    eP.establecerCostoCredito(costoCredito);
                    eP.calcularMatriculaPresencial();

                    System.out.printf("%s\n", eP);
                }
            }
        }

        /*
        switch (opc) {
            case 1:
                EstudianteDistancia e1 = new EstudianteDistancia();

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
                break;
            case 2:
                EstudiantePresencial eP = new EstudiantePresencial();
                System.out.println("Ingrese el numero de creditos");
                numeroCreditos = entrada.nextInt();
                System.out.println("Ingrese el costo por asignatura");
                costoCredito = entrada.nextDouble();

                eP.establecerNombresEstudiante(nombres);
                eP.establecerApellidoEstudiante(apellidos);
                eP.establecerIdentificacionEstudiante(cedula);
                eP.establecerEdadEstudiante(edad);
                eP.establecerNumeroCreditos(numeroCreditos);
                eP.establecerCostoCredito(costoCredito);
                eP.calcularMatriculaPresencial();

                System.out.printf("%s\n", eP);
            default:
                System.out.println("Numero no valido");
                
        }*/
    }
}
