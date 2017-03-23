/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.paint.vidmot;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Alexander Freyr Sveinsson, Háskóli Íslands, afs19@hi.is
 * 10.4.2016
 * Paint
 */
public class Blýantur extends Fletir{
    //fall sem litar blíant
    @Override
    public void Paint(Graphics g){
        g.setColor(color);
        g.fillRect(xPos,yPos,width,height);
    }
    
    // Smiður fyrir Blýant. tekkur in x y hnit hæð breid og lit
    Blýantur(int x, int y, int b, int h, Color c){
        this.xPos = x;
        this.yPos = y;
        this.height = h;
        this.width = b;
        this.color = c;
    }
    //yfirskrifar abstract aðferð í Yfirkassa
    //aðferð sem segir að þetta sé ekki strokleður
    @Override
    public boolean isStrokledur(){
        return false;
    }
    
    // Yfirskrifun á abstract aðferð frá yfirklasanum Flotur.
    
    
    
}
