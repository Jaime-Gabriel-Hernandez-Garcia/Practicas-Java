/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica22;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class JavaPractica22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Ejercicio 2: Pedir dos números y decir cuál es el mayor o si son iguales.
         */
        
        int numero1;
        int numero2;
        
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero 2"));
        
        if(numero1 > numero2){
            
            JOptionPane.showMessageDialog(null, "El numero " + numero1 + " Es mayor que " + numero2 +"");
            
        }
        
        if(numero1 < numero2){
            
            JOptionPane.showMessageDialog(null, "El numero " + numero2 + " Es mayor que " + numero1 +"");
            
        }
        
        if(numero1 == numero2){
            
            JOptionPane.showMessageDialog(null, "El numero " + numero1 + " Es igual que " + numero2 +"");
            
        }
        
    }
    
}
