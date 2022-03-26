/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica26;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class JavaPractica26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Ejercicio 7: Pedir tres números y mostrarlos ordenados de mayor a menor.
        */
        
        int numero1;
        int numero2;
        int numero3;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Intorduce el número 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Intorduce el número 2: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Intorduce el número 3: "));
        
        if((numero1 > numero2) && (numero2 > numero3)){
            
            JOptionPane.showConfirmDialog(null, "orden: " +  numero1 + " - " + numero2 + " - " + numero3);
            
        }
        
        else if((numero1 > numero3) && (numero3 > numero2)){
            
            JOptionPane.showConfirmDialog(null, "orden: " +  numero1 + " - " + numero3 + " - " + numero2);
            
        }
        
        else if((numero2 > numero1) && (numero1 > numero3)){
            
            JOptionPane.showConfirmDialog(null, "orden: " +  numero2 + " - " + numero1 + " - " + numero3);
            
        }
        
        else if((numero2 > numero3) && (numero3 > numero1)){
            
            JOptionPane.showConfirmDialog(null, "orden: " +  numero2 + " - " + numero3 + " - " + numero1);
            
        }
        
        else if((numero3 > numero1) && (numero1 > numero2)){
            
            JOptionPane.showConfirmDialog(null, "orden: " +  numero3 + " - " + numero1 + " - " + numero2);
            
        }
        
        else if((numero3 > numero2) && (numero2 > numero1)){
            
            JOptionPane.showConfirmDialog(null, "orden: " +  numero3 + " - " + numero2 + " - " + numero1);
            
        }
        
    }
    
}
