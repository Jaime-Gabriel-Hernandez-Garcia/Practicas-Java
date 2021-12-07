/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica5;

import java.util.Scanner;

/**
 *
 * @author ACER01
 */
public class JavaPractica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        /**
         * Guardar numeros
         */
        
        Scanner entrada = new Scanner(System.in);
        
        double numero;
        
        System.out.println("Numeros");
        
        System.out.println("Digite un numero: ");
        numero = entrada.nextDouble();
        
        System.out.println("El numero es: " + numero);
        
        
        /**
         * Guardar Cadenas
         */
        
        Scanner entrada2 = new Scanner(System.in);
        
        String cadena;
        
        System.out.println("");
        System.out.println("");
        System.out.println("Cadenas");
        
        System.out.println("Digite una cadena: ");
        cadena = entrada2.nextLine();
        
        System.out.println("La cadena es: " + cadena);
        
        
        
        /**
         * Guardar caracteres
         */
        
        Scanner entrada3 = new Scanner(System.in);
        
        char letra;
        
        System.out.println("");
        System.out.println("");
        System.out.println("Caracteres");
        
        System.out.println("Digite un caracter: ");
        letra = entrada3.next().charAt(0);
        
        System.out.println("El carcater es: " + letra);
        
    }
    
}
