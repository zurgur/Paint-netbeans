/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.paint.vidmot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.lang.Math.atan2;
import javax.swing.JPanel;

/**
 *
 * @author Alexander Freyr Sveinsson, Háskóli Íslands, afs19@hi.is
 * 10.4.2016
 * Paint
 */
public class Hringur extends Fletir {
    //auka bleitur fyrir línu
    private int xPos1;
    private int yPos1;
    //yfirskrifar abstract aðferð í Yfirkassa
    //málar hring
    @Override
    public void Paint(Graphics g){
        
        int x = xPos;
        
        if(xPos<xPos1){
           x = xPos;
       }else{
           x = xPos1;
       }
        
       int y = yPos;
       
       if(yPos<yPos1){
           y = yPos;
       }else{
           y = yPos1;
       }
      
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(width));
        g.setColor(color);
        g.drawOval(x,y,Math.abs(xPos1-xPos) ,Math.abs(yPos1-yPos));   

    }
    
    // Smiður fyrir hring. tekkur in x y hnit hæð breid og lit
    public Hringur(int x0, int y0, int x1, int y1, int width, Color color)
    {
        this.xPos = x0;
        this.yPos = y0;
        this.xPos1 = x1;
        this.yPos1 = y1;
        this.width = width;
        this.color = color;
    }
    //yfirskrifar abstract aðferð í Yfirkassa
    //aðferð sem segir að þetta sé ekki strokleður
    @Override
    public boolean isStrokledur(){
        return false;
    }
 
}

