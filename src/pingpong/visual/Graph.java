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
    
    private int amountOfSamples;
    private Sensor s1;
    
   
    public Graph(JPanel jpanel, Sensor s) {
        super(jpanel);
        this.amountOfSamples = vector.getX();
        this.s1 = s;
     /*   this.ratio = 1.4;
        this.width *= 1.1;
        this.vector.setX(vector.getX() - 20);   // deze code moet nog aangepast worden
        */
    }

    @Override
    public void draw() {
        this.graphic.setColor(Color.WHITE);
        this.graphic.drawLine(vector.getX(), vector.getY(),
                                vector.getX(), vector.getY() + height);
        this.graphic.drawLine(vector.getX(), vector.getY() + height,
                                vector.getX() + width, vector.getY() + height);
        
        
        /*
        this.graphic.setColor(Color.BLUE);  
      this.graphic.fillOval(vector.getX(), vector.getY(), 20, 20);
        
        */
    }
   

    @Override
    public void update() {
        
    }
       
        
    
}


/*
public class Graph{
   
   private Vector vertAssStartCoord,vertAssEndCoord;
   private Vector horzAssStartCoord,horzAssEndCoord;
   private float lenghtYass,lenghtXass;
   private float amountOfSamples;
   
   Graph(float x, float y, float lenghtYass, float lenghtXass){
     this.vertAssStartCoord = new Vector(x,y);
     this.vertAssEndCoord = new Vector(x,y + lenghtYass);
     this.horzAssStartCoord = new Vector(x,y + lenghtYass);
     this.horzAssEndCoord = new Vector(x + lenghtXass,y + lenghtYass);
     
     this.lenghtYass = lenghtYass;
     this.lenghtXass = lenghtXass; 
     
     this.amountOfSamples = horzAssStartCoord.getX();
   }
   
   public void create(){
     stroke(255);
     fill(#0000FF);
     line(vertAssStartCoord.getX(), vertAssStartCoord.getY(), vertAssEndCoord.getX(), vertAssEndCoord.getY());
     line(horzAssStartCoord.getX(), horzAssStartCoord.getY(), horzAssEndCoord.getX(), horzAssEndCoord.getY());  
   }
   
   public void update( float data){
      if (amountOfSamples == lenghtXass){
        amountOfSamples = horzAssStartCoord.getX();
        clear();
        create();
      } else {
        amountOfSamples++;
        noStroke();
        fill(#0000FF);
        ellipse(amountOfSamples, vertAssEndCoord.getY() - (data * lenghtYass) , 5, 5);
      }
   }
}

*/
