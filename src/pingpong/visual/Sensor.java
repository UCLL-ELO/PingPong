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
public class Sensor extends Visual{
    private double radiusDiff;

    public Sensor( Vector vector) {
        this.vector = vector;
    }

    public void setRadiusDiff(double radiusDiff) {
        this.radiusDiff = radiusDiff;
    }
    public double getRadiusDiff() {
        return this.radiusDiff;  
    }
    
    public Vector getVector() { return this.vector; }

    @Override
    public void draw(Graphics graphic) {
        graphic.setColor(Color.BLUE);  
        graphic.fillOval(vector.getX(), vector.getY(), 20, 20);
    }
}
