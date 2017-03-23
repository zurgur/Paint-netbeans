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
public abstract class Fletir {
    //hæð flatar
    protected int height;
    //breid flatar
    protected int width;
    //litur flatar
    protected Color color;
    //staðsetning flatar
    protected int xPos;
    protected int yPos;
    protected final int OFFSET = 1;

    //fall sem stillir x hnit flatar
    public void setxPos(int i) {
        xPos = i;
    }
    //fall sem stillir y hnit flatar
    public void setyPos(int i) {
        yPos = i;
    }
    //fall sem stirllir lit flatar 
    public void setColor(Color i) {
        color = i;
    }
    //fall sem stillir breid flatar
    public void setWhith(int i) {
        width = i;
    }
    //fall sem stillir hæð flatar
    public void setHeigt(int i) {
        height = i;
    }
    // Sækjum X hnitið á Fletinum(, Hringnum, Ferniingnum)
    public int getX() {
        return xPos;
    }
    // Sækjum Y hnitið á Fletinum(, Hringnum, Ferniingnum)
    public int getY(){
        return yPos;
    }
    // Sækjum breid hnitið á Fletinum(, Hringnum, Ferniingnum)
    public int getWhith(){
        return width;
    }
    // Sækjum hæð hnitið á Fletinum(, Hringnum, Ferniingnum)
    public int getHeight(){
        return height;
    }
    //abstract Paint aðferð sem segir hring eða kassa að mála sig sjálvir
    public abstract void Paint(Graphics g);
    
    public abstract boolean isStrokledur();
    
    
}
