/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica17;

import java.util.Scanner;

/**
 *
 * @author ACER01
 */
public class JavaPractica17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ejercicio 7: 
        Construir un programa que, dado un número total de horas, devuelve el 
        número de semanas, días y horas  equivalentes. Por ejemplo, dado un 
        total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
        */
        
        Scanner entrada = new Scanner(System.in);
        
        int horasTotales;
        int dias;
        int semanas;
        int horas;
        
        System.out.println("Digite el número de horas Totales:");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales / 168;
        
        dias = (horasTotales % 168) / 24;
        
        horas = horasTotales % 24; 
        
        System.out.println("El equivalente es: " );
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        
    }
    
}
