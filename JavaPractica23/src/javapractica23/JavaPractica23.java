/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica23;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Hernández
 */
public class JavaPractica23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Ejercicio 3: 
        Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
        */
        
        char digito;
        
        digito = JOptionPane.showInputDialog("Escribe una letra: ").charAt(0);
        
        if(Character.isUpperCase(digito)){
            
            JOptionPane.showMessageDialog(null, "Es una letra Mayuscula");
            
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Es una minuscula");
            
        }
        
    }
    
}