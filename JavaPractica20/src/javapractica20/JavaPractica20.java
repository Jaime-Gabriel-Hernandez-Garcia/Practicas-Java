/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica20;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class JavaPractica20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Sentencia Switch 
         */
        
        /*
        
        switch(dato){
        
            caso 1: instrucciones1;
                    break;
                    
            caso 2: instrucciones2;
                    break;
            
            caso n: instruccionesN;
                    break;
        
            default: CasoContrario;
                    break;
        }
        
        */
        
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1-5: "));
        
        switch(dato){
        
            case 1: JOptionPane.showMessageDialog(null, "Es el numero 1");
                    break;
            
            case 2: JOptionPane.showMessageDialog(null, "Es el numero 2");
                    break;
                 
            case 3: JOptionPane.showMessageDialog(null, "Es el numero 3");
                    break;
            
            case 4: JOptionPane.showMessageDialog(null, "Es el numero 4");
                    break;
            
            case 5: JOptionPane.showMessageDialog(null, "Es el numero 5");
                    break;
                    
            default:JOptionPane.showMessageDialog(null, "El numero es mayor que 5");
                    break;
            
        }
        
    }
    
}
