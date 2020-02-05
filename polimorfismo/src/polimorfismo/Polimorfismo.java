/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author SISTEMAS CORP
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        empleadoAsalariado p = new empleadoAsalariado
        (-12, "kevin", "jimenez", 17236);
        System.out.println(p);
        
        empleadoPorComision ec = new empleadoPorComision(25, 0.5, "kevin", "jimenez", 1723);
        System.out.println(ec);
        
        empleadoPorHoras eh = new empleadoPorHoras(20, 8, "KEVIN", "JIMENZ", 1833);
        System.out.println(eh);        
        
empleadoBaseMasComision ebc = new empleadoBaseMasComision(250, 25, 0.5, "kevin", "jimenez", 1788);
System.out.println(ebc);        
                
    }
    
}
