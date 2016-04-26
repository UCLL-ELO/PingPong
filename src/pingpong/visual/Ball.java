/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong.visual;

import java.awt.Color;
import java.awt.Graphics;
import pingpong.Vector;

/**
 *
 * @author Gilles
 */
public class Ball extends Visual {

    @Override
    public void draw(Graphics graphic) {
        graphic.setColor(Color.white);  
        graphic.fillOval(vector.getX(), vector.getY(), 20, 20);
    }
    
    public void setVector(Vector vector) { this.vector = vector; }  
}
