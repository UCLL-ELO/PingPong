/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong.visual;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Gilles
 */
public class Pallet extends Visual{
    
    private int lenghtPalletStele, lenghtStele, lenghtPallet;
    private int widthPallet, widthStele;
    
    private Sensor s1,s2,s3; 
    public Pallet(JPanel jpanel){
       // default values 
       this.lenghtPalletStele = 400;
       this.lenghtStele = 88;
       this.widthPallet = 285;
       this.widthStele = 55;
       
       this.lenghtPallet = lenghtPalletStele - lenghtStele;
        
       CreateFramework(jpanel, widthPallet , lenghtPalletStele );  
    }
    
    @Override
    public void draw(Graphics graphic){
      graphic.setColor(Color.DARK_GRAY);  
      graphic.fillOval(vector.getX(), vector.getY(), width, lenghtPallet);
      graphic.setColor(new Color(153, 153, 153)); 
      graphic.fillRect( vector.getX(), vector.getY() + width, width, height-width);
      graphic.setColor(Color.decode("#8B3E2F"));
      graphic.fillRect((vector.getX() + width/2) - widthStele/2,
                    vector.getY() + width, widthStele, height-width);                    
    } 

    public void setLenghtPalletStele (int value) { this.lenghtPalletStele = value; }
    public void setLenghtStele (int value) { this.lenghtStele = value; }
    public void setWidthPallet (int value) { this.widthPallet = value; }
    public void setWidthStele (int value) { this.widthStele = value; }
}
