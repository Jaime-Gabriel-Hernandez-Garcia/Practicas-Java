/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica19;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER01
 */
public class JavaPractica19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        if(condicion){
            instruccion1;
        }
        else{
            instruccion2;
        }
        */
        
        int numero;
        int dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero != dato){
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }
        
        
    }
    
}
