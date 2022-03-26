/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica25;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class JavaPractica25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Ejercicio 6:
        Hacer un programa que tome dos numeros y diga si ambos son 
        pares o impares
        */
        
        int numero1;
        int numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1"));
        
        
        if(numero1 % 2 == 0){
            
            JOptionPane.showConfirmDialog(null, numero1 + "  Es número par");
            
        }
        
        
        if(numero1 % 2 != 0){
            
            JOptionPane.showConfirmDialog(null, numero1 + "  No es un número par");
            
        }
        
        
        if(numero2 % 2 == 0){
            
            JOptionPane.showConfirmDialog(null, numero2 + "  Es número par");
            
        }
        
        
        if(numero2 % 2 != 0){
            
            JOptionPane.showConfirmDialog(null, numero2 + "  No es un número par");
            
        }
        
    }
    
}
