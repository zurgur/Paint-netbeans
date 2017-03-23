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
public class Lína extends Fletir{
    //auka bleitur fyrir línu
    int xPos1;
    int yPos1;
    //smiður fyrir línu
    public Lína(int x0,int y0, int x1,int y1, int b, Color c){
        this.color = c;
        this.width = b;
        this.xPos = x0;
        this.yPos = y0;
        this.xPos1 = x1;
        this.yPos1 = y1;
        
    }
    //fall sem teiknar línu
    @Override
    public void Paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(width));
        g.setColor(color);
        g.drawLine(xPos, yPos, xPos1, yPos1);
    }
    //yfirskrifar abstract aðferð í Yfirkassa
    //aðferð sem segir að þetta sé ekki strokleður
    @Override
    public boolean isStrokledur(){
        return false;
    }
    
    
}
