/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica21;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class JavaPractica21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Ejercicio 1: Programa que lea un número entero y muestre si el número es múltiplo de 10.
         */
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número"));
        
        
        if(numero%10 == 0){
            
            JOptionPane.showMessageDialog(null, "El numero" + numero + " es multiplo de 10");
            
        }
        else{
            
            JOptionPane.showMessageDialog(null, "El numero" + numero + "no es multiplo de 10");
            
        }
        
    }
    
}
