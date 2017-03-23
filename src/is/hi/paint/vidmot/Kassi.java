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
import javax.swing.JPanel;

/**
 *
 * @author Alexander Freyr Sveinsson, Háskóli Íslands, afs19@hi.is
 * 10.4.2016
 * Paint
 */
public class Kassi extends Fletir {
    //auka bleitur fyrir línu
    private int xPos1;
    private int yPos1;
    //fall sem litar kassa
 @Override
    public void Paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(color);
        g2.setStroke(new BasicStroke(width));
        g.drawLine(xPos, yPos, xPos1, yPos);
        g.drawLine(xPos1, yPos, xPos1, yPos1);
        g.drawLine(xPos, yPos1, xPos1, yPos1);
        g.drawLine(xPos, yPos, xPos, yPos1);
    }
    //smiður fyrir kassa sem tekur inn x hint y hnit hæð breid og lit
    public Kassi(int x0,int y0,int x1,int y1,int b, Color c) {
        xPos = x0;
        yPos = y0;
        xPos1 = x1;
        yPos1 = y1;
        color = c;
        width = b;
        
    }
    //yfirskrifar abstract aðferð í Yfirkassa
    //aðferð sem segir að þetta sé ekki strokleður
    @Override
    public boolean isStrokledur(){
        return false;
    }
    

}