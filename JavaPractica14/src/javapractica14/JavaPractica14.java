/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica14;

import java.util.Scanner;

/**
 *
 * @author ACER01
 */
public class JavaPractica14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Ejercicio 4
        Una compañia de venta de autos usados paga a su personal de ventas
        un salario de $1000 mensuales, mas una comisión de $150 por cada carro 
        vendido, mas el 5% del valor de la venta por carro. Cada mes del 
        capturista de la empresa ingresa en la computadora de los datos 
        pertinentes. Hacer un programa que calcule e imprima el salario emnsual 
        de un vendedor dado 
        */
        
        Scanner entrada = new Scanner(System.in);
         
        float autos; 
        float comision;
        float valor; 
        float extra; 
        float total;
        
        System.out.println("¿Cuantos autos vendio en el mes?");
        autos = entrada.nextFloat();
        
        comision = 150 * autos; 
        
        System.out.println("¿Cul fue el valor de los autos?");
        valor = entrada.nextFloat();
        
        extra = (float) (.05 * valor); 
        
        total = 1000 + comision + extra;
        
        System.out.println("El total del salario es: " + total);
        
    }
    
}
