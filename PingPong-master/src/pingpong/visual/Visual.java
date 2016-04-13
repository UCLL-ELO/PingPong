/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong.visual;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import pingpong.Vector;

/**
 *
 * @author Gilles
 */
public abstract class Visual {
    
    protected Graphics graphic;
    protected Vector vector;
    protected int width,height;
    protected double ratio;
    
    public Visual(JPanel jpanel){
        
      this.vector = new Vector(0,0);
      this.graphic = jpanel.getGraphics();
      
      this.ratio =  1.2;
      
      this.width = (int) (jpanel.getWidth()/ratio);
      this.height = (int) (jpanel.getHeight()/ratio);
      
      this.vector.setX ((jpanel.getWidth() - this.width)/2);
      this.vector.setY ((jpanel.getHeight() - this.height)/2);
      
      
    }
    
    public abstract void draw();
    public abstract void update();
    
    public void clear(){
     this.graphic.setColor(Color.black); 
     this.graphic.fillRect(vector.getX(), vector.getY(), width, height); 
    }
        
    
    
          
    
    
}
