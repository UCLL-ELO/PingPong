/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong.math;

import java.awt.Color;
import javax.swing.JPanel;
import pingpong.Vector;

/**
 *
 * @author Gilles
 */
public class Sensor{
    private Vector position,intersection;
    private double radius;

    public Sensor(Vector vector) {
        this.position = vector;
        this.radius = 0;
    }
    
    
    public void setRadius(double radius) { this.radius = radius; }
    public double getRadius() { return this.radius; }
    
    public Vector getVector() { return this.position; }
    public Vector getIntersection() { return this.intersection; }
    
     public void calculateSnijpunten(Sensor s){
    double rFirst = this.radius/2;
    double rSec = s.getRadius()/2;
    double d = Math.sqrt(Math.pow(this.position.getX()- this.position.getY(),2) + 
                      Math.pow(s.getVector().getX()- s.getVector().getY(),2)); 
    
    // controleer of de cirkels botsen
    if( d < rFirst + rSec){  // ze botsen (2 punten)
      calculateSnijpunt(s,1);
      calculateSnijpunt(s,-1);
    }else if(d == rFirst + rSec){ // ze raken elkaar juist aan (1punt)
      calculateSnijpunt(s,1);
    }else{
      System.out.println("no intersect");
    }
  }
  
  public void calculateSnijpunt(Sensor s, float flip){ 
    double rFirst = this.radius/2;
    double rSec = s.getRadius()/2;
    double d = Math.sqrt (Math.pow(this.position.getX()- this.position.getY(),2) + 
                      Math.pow(s.getVector().getX()- s.getVector().getY(),2));
    
    double a = (Math.pow(rFirst,2) - Math.pow(rSec,2) + Math.pow(d,2))/ (2 * d);
    double h = Math.sqrt(Math.pow(rFirst,2) - Math.pow(a,2));
                  
    double xMid = this.position.getX() + a*(s.getVector().getX() - this.position.getX()) / d;
    double yMid = this.position.getY() + a*(s.getVector().getY() - this.position.getY()) / d;
          
    double xIntersect = xMid + flip * h*(s.getVector().getY() - this.position.getY()) / d;
    double yIntersect = yMid - flip * h*(s.getVector().getX() - this.position.getX()) / d;
    
    intersection.setX((int) xIntersect);
    intersection.setY((int) yIntersect);  
  }   
  
  
}
