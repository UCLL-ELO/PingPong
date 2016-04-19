/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong.visual;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import pingpong.Vector;

/**
 *
 * @author Gilles
 */
public abstract class Visual {
    
    protected Graphics2D graphic;
    protected Vector vector;
    protected int width,height;
    
    public Visual(JPanel jpanel){
        
      this.vector = new Vector(0,0);
      this.graphic = (Graphics2D)jpanel.getGraphics();
      
      graphic.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING, 
                    RenderingHints.VALUE_ANTIALIAS_ON);
    }
    
    public abstract void draw();
  
    public void clear(){
     this.graphic.setColor(Color.gray); 
     this.graphic.fillRect(vector.getX(), vector.getY(), width, height); 
    }
    
    public void CreateFramework(double ratio, JPanel jpanel){
      this.width = (int) (jpanel.getWidth()/ratio);
      this.height = (int) (jpanel.getHeight()/ratio);
      
      this.vector.setX ((jpanel.getWidth() - this.width)/2);
      this.vector.setY ((jpanel.getHeight() - this.height)/2);
    }
    
    public void CreateFramework( JPanel jpanel, int width, int height){
      this.width = width;
      this.height = height;
      
      this.vector.setX ((jpanel.getWidth() - width)/2);
      this.vector.setY ((jpanel.getHeight() - height)/2);
    } 
}
