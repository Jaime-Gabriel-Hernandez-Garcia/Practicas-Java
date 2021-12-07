/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica10;

/**
 *
 * @author ACER01
 */
public class JavaPractica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Raiz Cuadrada
         */
        
        double raiz = Math.sqrt(9);
        System.out.println("Raiz Cuadrada");
        System.out.println(raiz);
        
        
        
        /**
         * Base elevada
         */
        
        double numero = 5;
        double exponente = 3;
        
        double resultado = Math.pow(numero, exponente);
        System.out.println("");
        System.out.println("");
        System.out.println("Exponentes");
        System.out.println(resultado);
        
        
        
        /**
         * Redondeo
         */
        
        double numero2 = 4.55f;
        double resultado2 = Math.round(numero2);
        System.out.println("");
        System.out.println("");
        System.out.println("Redondeo");
        System.out.println(resultado2);
        
        
        
        /**
         * Aleatorio
         */
        
        double numero3 = Math.random();
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("Aleatorio");
        System.out.println(numero3);
        
    }
    
}
