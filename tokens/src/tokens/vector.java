/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS CORP
 */
public class vector {
    
    private int vector[];

    public vector() {
    }
    
    public vector(int[] vector) {
        super();
        this.vector = vector;
    }
    
    public vector(int dimension) {
        super();        
        this.vector = new int[dimension];
        this.setVector();
        
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector() {
        //this.vector = vector;
        String datosVector;
        datosVector = JOptionPane.showInputDialog(null, 
                "Ingrese los valores separados por coma");
        StringTokenizer tokkens = new 
        StringTokenizer(datosVector, ","); //datos,separador
        
        for (int i = 0; 
             i < this.vector.length&&tokkens.hasMoreTokens();
             i++) {            
             this.vector[i] = Integer.parseInt(tokkens.nextToken());
        }
        
        
    }

    @Override
    public String toString() {
        return "vector: "+Arrays.toString(vector);
    }
    
    
    
    
    
}
