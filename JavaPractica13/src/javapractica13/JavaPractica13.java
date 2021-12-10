/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica13;

import java.util.Scanner;

/**
 *
 * @author ACER01
 */
public class JavaPractica13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Ejercicio 3
        Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo
        Juan tiene la mitad de lo que poseen luis y Guillermo juntos. Hacer un 
        programa que calcule e imprima la cantidad de dinero quue tienen entre los
        tres
        */
        
        float Guillermo; 
        float Luis;
        float Juan;
        float resultado;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de dinero que tiene Guillermo: ");
        Guillermo = entrada.nextFloat();
        
        Luis = Guillermo / 2;
        
        Juan = (Guillermo + Luis)/2;
        
        resultado = Guillermo + Juan + Luis;
        
        System.out.println("El total es: " + resultado);
        
    }
    
}
