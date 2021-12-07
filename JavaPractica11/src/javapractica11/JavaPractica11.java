/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica11;

import java.util.Scanner;

/**
 *
 * @author ACER01
 */
public class JavaPractica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Ejercicio 1 
         * Hacer un programa que calcules e imprima la suma de 3 calificaciones.
         */
        
        Scanner entrada = new Scanner(System.in);
        
        double calificacion1;
        double calificacion2;
        double calificacion3;
        double calificacionF;
        
        System.out.println("Digite la primera calificaión: ");
        calificacion1 = entrada.nextDouble();
        
        System.out.println("Digite la segunda calificación: ");
        calificacion2 = entrada.nextDouble();
        
        System.out.println("Digite la tercera calificación: ");
        calificacion3 = entrada.nextDouble();
        
        calificacionF = calificacion1 + calificacion2 + calificacion3;
        
        System.out.println("La calificación final es: " + calificacionF);
    }
    
}
