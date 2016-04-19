/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong.visual;

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
    public Pallet(JPanel jpanel){
       super(jpanel);
       CreateFramework(jpanel, 285 , 400 );  
    }
    
    @Override
    public void draw(){
      super.clear();
      this.graphic.setColor(Color.DARK_GRAY);  
      this.graphic.fillOval(vector.getX(), vector.getY(), width, 312);
      this.graphic.setColor(Color.gray);
      this.graphic.fillRect(0, vector.getY() + width, width, height-width);
      this.graphic.setColor(Color.decode("#8B3E2F"));
      this.graphic.fillRect((vector.getX() + width/2) - 55/2,
                              vector.getY() + width, 55, height-width);
    }     
}
