/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong.visual;

import pingpong.math.Sensor;
import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import javax.swing.JPanel;
import pingpong.Vector;

/**
 *
 * @author Gilles
 */
public class Pallet extends Visual{
    
    private Sensor s1,s2,s3;
   
    public Pallet(JPanel jpanel, LinkedList<Sensor> sensorList){
       super(jpanel);
       this.s1 = sensorList.get(0);
       this.s2 = sensorList.get(1);
       this.s3 = sensorList.get(2);
       
    }
    
    @Override
    public void draw(){
      super.clear(); 
      
      this.graphic.setColor(Color.decode("#6E8B3D"));  
      this.graphic.fillOval(vector.getX(), vector.getY(), width, width);
      this.graphic.setColor(Color.decode("#8B3E2F"));
      this.graphic.fillRect((vector.getX() + width/2) - width/8,
                              vector.getY() + width, width/4, height-width);
     // this.graphic.drawRect(vector.getX(), vector.getY(), width, height);
     drawSensors();
    }
    
    public void drawSensors(){
        this.graphic.setColor(Color.BLUE);  
        this.graphic.fillOval(s1.getVector().getX(), s1.getVector().getY(), 20, 20);
        this.graphic.fillOval(s2.getVector().getX(), s2.getVector().getY(), 20, 20);
        this.graphic.fillOval(s3.getVector().getX(), s3.getVector().getY(), 20, 20);
    }
    
    public void drawRadiusSensor(){
        
    }
    
    

    @Override
    public void update() {
        draw();
        drawSensors();
        drawRadiusSensor();
    }
    
    
    
    
}
