/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica18;

import java.util.Scanner;

/**
 *
 * @author ACER01
 */
public class JavaPractica18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Ejercicio 8: 
        construir un programa que calcule y muestre por pantalla las raíces de
        una ecuación de segundo grado de coeficientes reales.
        */
        
        Scanner entrada = new Scanner(System.in);
        
        int a; 
        int b; 
        int c;
        int x1;
        int x2;
        int ecuacion;
        
        System.out.println("Digite el valor de a: ");
        a = entrada.nextInt();
        
        System.out.println("Digite el valor de b: ");
        b = entrada.nextInt();
        
        System.out.println("Digite el valor de c: ");
        c = entrada.nextInt();
        
        x1 = (int)(-b + Math.sqrt((b * b) - (4*a*c))) / 2*a;
        x2 = (int)(-b - Math.sqrt((b * b) - (4*a*c))) / 2*a;
        
        System.out.println("El resultado 1 es: " + x1);
        System.out.println("El resultado 2 es: " + x2);
    }
    
}
