/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

/**
 *
 * @author SISTEMAS CORP
 */
public class serie {
    
    // numero
    
    private int n;                                

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public serie(){                
    }
    
    public int calcularSerie(){
        int base = 2;
        int resultado = 1;        
        for (int i = 1; i <= this.n; i++) {            
            resultado = resultado * base;
            //resultado *= base;                        
        }
        return resultado;
    }
    
    
}
