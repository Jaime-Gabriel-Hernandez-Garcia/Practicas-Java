/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica24;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabo
 */
public class JavaPractica24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /*
        Ejercicio 5:
        Un obrero necesita calcular su salario semanal, 
        el cual se obtiene de la siguiente manera: Si trabaja 40 horas
        o menos se le paga $16 por hora. Si trabaja mas de 40 horas se
        le paga $16 por cada una de las primeras 40 horas y $20 por cada
        hora extra. 
        */
       
        
       int horasTrabajadas;
       float salarioTotal ;
       
       horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite el Total de horas trabajadas"));
       
       if(horasTrabajadas <= 40){
           
           salarioTotal = horasTrabajadas * 16;
           
       }
       else{
           
           salarioTotal = (40 * 16) + ((horasTrabajadas - 40) * 20);
           
       }
       
       JOptionPane.showMessageDialog(null, "Tu salario final es: " + salarioTotal);
        
    }
    
}
