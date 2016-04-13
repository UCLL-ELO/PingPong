/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

/**
 *
 * @author Gilles
 */
public class Vector {
      private int x, y;

  public Vector(int x, int y) {
    // constructor
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }
  
  public void setX(int x) {
    this.x= x;
  }

  public void setY(int y) {
    this.y= y;
  }

  public int distance(Vector v2) {
   return (int) Math.sqrt(Math.pow((x - v2.getX()), 2) 
                                        + Math.pow((y - v2.getY()), 2)); 
  }
/*
  public float angle(Vector v2) {
    return atan2(v2.getY()- this.getY(), v2.getX() - this.getX());
  }
*/
}
