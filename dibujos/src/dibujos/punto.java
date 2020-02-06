/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS CORP
 */
public class punto extends figura {

    private int x;
    private int y;

    public punto() {
        super();
        String datos;
        datos = JOptionPane.showInputDialog("ingrese las coordenadas x,y separados con coma");
        StringTokenizer tokens = new StringTokenizer(datos, ",");

        this.x = Integer.parseInt(tokens.nextToken());
        this.y = Integer.parseInt(tokens.nextToken());
    }

    public punto(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        g.setColor(Color.RED);
        g.fillOval(this.x, this.y, 30, 30);

    }
    
    @Override
    public String toString() {
        return "\nPunto [x= " + this.x + ", y= " + this.y + ']';
    }

    @Override
    public double getArea() {
        return 0;
    }
}
