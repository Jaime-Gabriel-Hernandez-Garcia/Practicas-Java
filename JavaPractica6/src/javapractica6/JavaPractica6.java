/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica6;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER01
 */
public class JavaPractica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        //Variables
        
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        
        
        //Entrada con Joption
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un Entero: "));
        
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        
        
        
        //Salida con Joption
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        
        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
        
        JOptionPane.showMessageDialog(null, "El caracter es: " + letra);
        
        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);
        
    }
    
}
