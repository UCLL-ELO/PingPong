/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong.visual;

import java.awt.Color;
import javax.swing.JPanel;
import pingpong.Vector;
import pingpong.math.Sensor;

/**
 *
 * @author Gilles
 */
public class Graph extends Visual{
    
    private int amountOfSampleTime;
    private double timeOfClear;
    
   
    public Graph(JPanel jpanel, double timeOfClear) {
        super(jpanel);
        this.amountOfSampleTime = 0;
        this.timeOfClear = timeOfClear;
    }

    @Override
    public void draw() {
        this.graphic.setColor(Color.WHITE);
        this.graphic.drawLine(vector.getX(), vector.getY(),
                                vector.getX(), vector.getY() + height);
        this.graphic.drawLine(vector.getX(), vector.getY() + height,
                                vector.getX() + width, vector.getY() + height);
    }
   

    public void update(double data, double sampleTime) {
       amountOfSampleTime += sampleTime;      
        if (amountOfSampleTime < timeOfClear) {
            double verticalPointOnXass = ((amountOfSampleTime/timeOfClear) * width) + vector.getX();
            double verticalPointOnYass = (height + vector.getY())  - (data * height) ;
            
            System.out.print(verticalPointOnYass);
            this.graphic.setColor(Color.BLUE);  
            this.graphic.fillOval((int) verticalPointOnXass, (int) verticalPointOnYass, 4, 4);
            
        } else {
            super.clear();
            this.draw();
            this.amountOfSampleTime = 0;
        } 
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
        
    
}


