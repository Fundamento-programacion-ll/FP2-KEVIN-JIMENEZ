/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Graphics;

/**
 *
 * @author SISTEMAS CORP
 */
public class miLinea extends miFigura{

    @Override
    public void dibujar(Graphics g) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        g.drawLine(0, 0, 0, 0);
        super.paintComponent(g);
        
    }
    
    
    
}
