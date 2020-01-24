/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS CORP
 */
public class Tokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dimension = Integer.parseInt(JOptionPane
                .showInputDialog(null,
                "Ingrese la dimension del arreglo"));
        
        
        vector vec = new vector(dimension);
        System.out.println(vec);
        
        
        
    }
    
}
