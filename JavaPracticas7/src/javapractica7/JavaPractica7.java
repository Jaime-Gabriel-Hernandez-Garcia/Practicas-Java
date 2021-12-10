/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica7;

import java.util.Scanner;
   
/**
 *
 * @author ACER01
 */
public class JavaPractica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        
        
        //Scanner entradas
        Scanner entrada = new Scanner(System.in);
        
        
        
        //Variables
        
        float numero1;
        float numero2;
        float suma;
        float resta;
        float multiplicacion;
        float division;
        float resto;
        
        
        
        //Entradas consolas
        System.out.println("Digite 2 numeros");
        
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        
        
        
        //Operaciones
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        resto = numero1 % numero2;
        
        
        
        
        //Salida por consola 
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicción es: " + multiplicacion);
        System.out.println("La división es: " + division);
        System.out.println("El modular es: " + resto);
        
    }
    
}
