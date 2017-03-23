/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.paint.vinsla;

import is.hi.paint.vidmot.MyndPanel;
import is.hi.paint.vidmot.StærðPanel;
import java.awt.Color;

/**
 *
 * @author Alexander Freyr Sveinsson, Háskóli Íslands, afs19@hi.is
 * 10.4.2016
 * Paint
 */
public class PaintVinsla {

    /**
     * @return the adgerd
     */
    public TeikniTag getAdgerd() {
        return adgerd;
    }

    /**
     * @param adgerd the adgerd to set
     */
    public void setAdgerd(TeikniTag adgerd) {
        this.adgerd = adgerd;
    }
    //gerir TeikniTag með {BLÝANTU, PENSIL, HRINGUR, KASSI og LÍNA
    public enum TeikniTag{BLÝANTUR, PENSIL,STROKLEÐUR, HRINGUR, KASSI, LÍNA}
    
    //Setur AdgerdarTag í BLÝANTUR
    private TeikniTag adgerd=TeikniTag.BLÝANTUR;
    
    private MyndPanel mínMynd = new MyndPanel();
    private int stærð =50;
    private Color color = Color.BLACK;
    //fall sem skilar stærð
    public int getStærð(){
        return stærð;
    }
    //fal sem skilar lit
    public Color getColor(){
        return color;
    }
    //fall sem setur stærð
    public void setStærð(int i){
        stærð = i;
    }
    //fall sem setur lit
    public void setColor(Color c){
        color = c;
    }
    
    
    
}
