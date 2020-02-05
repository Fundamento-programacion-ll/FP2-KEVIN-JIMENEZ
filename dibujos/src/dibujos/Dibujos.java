/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS CORP
 */
public class Dibujos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // TODO code application logic here
        
        punto pto = new punto();
        JFrame ventana = new JFrame();
        ventana.add(pto);
        ventana.setSize(700,400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
