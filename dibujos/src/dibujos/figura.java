/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author SISTEMAS CORP
 */
public abstract class figura extends Canvas {

    public abstract double getVolumen();

    public abstract void paint(Graphics g);

    public abstract double getArea();

    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "";
    }

}
