/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica16;

import java.util.Scanner;

/**
 *
 * @author ACER01
 */
public class JavaPractica16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Ejercicio 6 
        Hacer un programa que calcule el cuadrado de una suma
        (a + b)^2 = a^2 + 2ab + b^2
        */
        
        Scanner entrada = new Scanner(System.in);
        
        float a;
        float aC;
        float b;
        float bC;
        float ab2;
        float resultado; 
        
        System.out.println("Digite el valor de a: ");
        a = entrada.nextFloat();
        
        System.out.println("Digite el valor de b: ");
        b = entrada.nextFloat();
        
        aC = a * a;
        
        bC = b * b;
        
        ab2 = 2 * a * b; 
        
        resultado = aC + bC + ab2;
        
        System.out.println("El resultado es: " + resultado);
    }
    
}
