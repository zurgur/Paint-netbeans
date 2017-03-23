/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.paint.vidmot;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Alexander
 */
public class Strokledur extends Fletir{
    //fall sem litar blíant
    @Override
    public void Paint(Graphics g){
        g.setColor(color);
        g.fillRect(xPos,yPos,width,height);
    }
    
    // Smiður fyrir Strokledur. tekkur in x y hnit hæð breid og lit
    Strokledur(int x, int y, int b, int h, Color c){
        this.xPos = x;
        this.yPos = y;
        this.height = h;
        this.width = b;
        this.color = c;
    }
    //yfirskrifar abstract aðferð í Yfirkassa
    //aðferð sem segir að þetta sé strokleður
    @Override
    public boolean isStrokledur(){
        return true;
    }
}
