/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica12;

import java.util.Scanner;

/**
 *
 * @author ACER01
 */
public class JavaPractica12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float salarioH;
        float horas;
        float salarioF;
        
        System.out.println("Digite su salario x hora: ");
        salarioH = entrada.nextFloat();
        
        System.out.println("Digite sus horas semanales: ");
        horas = entrada.nextFloat();
        
        salarioF = salarioH * horas;
        
        System.out.println("Su salario semanal es: " + salarioF);
        
        
        
    }
    
}
