/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong.visual;

import java.awt.Color;
import javax.swing.JPanel;
import pingpong.Vector;

/**
 *
 * @author Gilles
 */
public class Ball extends Visual {

    public Ball (JPanel jpanel) { super(jpanel); }

    @Override
    public void draw() {
        this.graphic.setColor(Color.white);  
        this.graphic.fillOval(vector.getX(), vector.getY(), 20, 20);
    }
    
    public void setVector(Vector vector) { this.vector = vector; }  
}
