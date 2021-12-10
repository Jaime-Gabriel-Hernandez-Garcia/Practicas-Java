/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica15;

import java.util.Scanner;

/**
 *
 * @author ACER01
 */
public class JavaPractica15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Ejercicio 5: La calificación final de un estudiante de Informática se 
        calcula con base a las calificaciones de cuatro aspectos de su 
        rendimiento académico: participación, primer examen parcial, segundo 
        examen parcial y examen final. Sabiendo que las calificaciones anteriores
        entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%,
        Hacer un programa que calcule e imprima la calificación final obtenida
        por un estudiante.
        */
        
        Scanner entrada = new Scanner(System.in);
        
        float participacion;
        float examen1;
        float examen2;
        float examen3;
        float calificacion;
        
        System.out.println("Digite la nota de participación");
        participacion = entrada.nextFloat();
        
        System.out.println("Digite la calificacion del 1° examen");
        examen1 = entrada.nextFloat();
        
        System.out.println("Digite la calificacion del 2° examen");
        examen2 = entrada.nextFloat();
        
        System.out.println("Digite la calificacion del examen final");
        examen3 = entrada.nextFloat();
        
        participacion *= .10f;
        
        examen1 *= .25f;
        
        examen2 *= .25f;
        
        examen3 *= .40f;
        
        
        calificacion = participacion + examen1 + examen2 + examen3;
        
        System.out.println("La calificación final es: " + calificacion);
    }
    
}
