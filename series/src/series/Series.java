/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

import java.util.Scanner;

/**
 *
 * @author SISTEMAS CORP
 */
public class Series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        serie instanciaSerie = new serie();
        int numeroIngreado = 0;
        Scanner numeroUno = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numeroIngreado = numeroUno.nextInt();
        instanciaSerie.setN(numeroIngreado);
        instanciaSerie.calcularSerie();
        System.err.println("RESULTADO: "+instanciaSerie.calcularSerie());
        
        
        
        
        
        
        
    }
    
}
