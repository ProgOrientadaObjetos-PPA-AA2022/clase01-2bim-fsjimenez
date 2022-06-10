/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;
import herencia1.*;
/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {
    public static void main(String[] args) {
        EstudiantePresencial eP1 = new EstudiantePresencial();
        eP1.establecerNombresEstudiante("Felipe Sebastián");
        eP1.establecerApellidoEstudiante("Jimenez Viñan");
        eP1.establecerIdentificacionEstudiante("1103316673");
        eP1.establecerEdadEstudiante(18);
        eP1.establecerNumeroCreditos(30);
        eP1.establecerCostoCredito(15);
        eP1.calcularMatriculaPresencial();
        
        
        System.out.printf("Nombres: %s\nApellidos: %s\nIdentificacion: %s\n"
                + "Edad: %d\nNúmero de Créditos: %d\nCosto por Crédito: %.2f\n"
                + "Costo Matrícula: %.2f\n", eP1.obtenerNombresEstudiante(),
                                            eP1.obtenerApellidoEstudiante(),
                                            eP1.obtenerIdentificacionEstudiante(),
                                            eP1.obtenerEdadEstudiante(),
                                            eP1.obtenerNumeroCreditos(),
                                            eP1.obtenerCostoCredito(),
                                            eP1.obtenerMatriculaPresencial());
    }
}
