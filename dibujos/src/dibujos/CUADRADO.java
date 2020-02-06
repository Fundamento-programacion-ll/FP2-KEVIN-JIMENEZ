/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author SISTEMAS CORP
 */
public class CUADRADO extends punto{
    private int lado;

    public CUADRADO() {
        this.lado = 300;
    }

    public CUADRADO(int lado, int x, int y) {
        super(x, y);
        this.lado = lado;
    }
    
    
    
    

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public void paint(Graphics g) {        
        g.setColor(Color.DARK_GRAY);
        g.drawRect(lado, lado, lado, lado);

    }
}
