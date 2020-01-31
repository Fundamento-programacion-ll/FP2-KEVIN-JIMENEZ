/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author SISTEMAS CORP
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        perro perrito = new perro(10, "perro","masculino", "simurdiera");
        perrito.datosPerro();
        perrito.sumaPerro(1, 2);
        // ---------------------------------
        
        gato gatito = new gato("verdes", "gatos", "m", "chuky");
        gatito.info();
    }
    
}
