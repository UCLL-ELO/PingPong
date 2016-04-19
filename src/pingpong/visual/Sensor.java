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
public class Sensor extends Visual{
    private double radiusDiff;

    public Sensor(JPanel jpanel, Vector vector) {
        super(jpanel);
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
    public void draw() {
        this.graphic.setColor(Color.BLUE);  
        this.graphic.fillOval(vector.getX(), vector.getY(), 20, 20);
    }
}
