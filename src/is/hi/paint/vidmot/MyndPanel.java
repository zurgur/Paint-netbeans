/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.paint.vidmot;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Alexander Freyr Sveinsson, Háskóli Íslands, afs19@hi.is
 * 10.4.2016
 * Paint
 */
public class MyndPanel extends javax.swing.JPanel {
    //geri array fletir
    private final Fletir[] fletir = new Fletir[1];
    //geri ArrayList af Fletir
    ArrayList<Fletir> allt = new ArrayList<Fletir>();
    //geri breitu hverEr og stilli í 0
    private int hverEr = 0;
    //geri breytu stærð og set 50
    private int stærð = 50;
    //beri lita breyru og stilli sem svartur
    private Color aðalLitur = Color.black;
    //geri beritu x0
    private int x0 = 0;
    //geir breitu y0
    private int y0 = 0;
    /**
     * Creates new form MyndPanel
     */
    
    
    public MyndPanel() {
        initComponents();
        //fall sem hlustar eftir að músinn sé ýtt niður (e. pressed)
        addMouseListener(new MouseAdapter() {
            @Override public void mousePressed(MouseEvent evt) {
                x0 =evt.getX();
                y0 =evt.getY();
            }
        });
        // handler sem bregst við færslu músar (e. dragged) 
        addMouseMotionListener(new MouseAdapter() {
        @Override public void mouseDragged(MouseEvent e) {
                teikna(e.getX(),e.getY());
            }
        });
        
        //handler sem bregst við þegar músar takka er sleppt
        addMouseListener(new MouseAdapter() {
            @Override public void mouseReleased(MouseEvent evt) {
                kassarLinurHringir(evt.getX(),evt.getY());                               
            }
        });
       
       
    }
    //fall sem breytir lit á strokleðri
    public void lagaStrokledur(){
        for(int i = 0;i< allt.size();i++){
            if((allt.get(i)).isStrokledur()){
                allt.get(i).setColor(this.getBackground());
            }
        }
    }
    //fall til þess að breyta stærð
    public void setStærð(int s){
        stærð = s;
    }
    //fall til þess að breyta lit
    public void setLitur(Color c){
        this.aðalLitur = c;
    }
    //fall sem breitir HverEr
    public void setHverEr(int h){
        hverEr = h;
    }
    //fall til þess að eyða öllu
    public void nýBls(){
        allt.clear();
        eydaFletir();
    }
    //fall sem teiknar meðan það er verið að draga músinni
    public void teikna(int x, int y){
        
         switch (hverEr) {
             case 0:
                 allt.add(new Blýantur(x - stærð/2,y - stærð/2,stærð,stærð,aðalLitur));
                repaint();
                break;
             case 1:
                 allt.add(new Pensil(x - stærð/2,y - stærð/2,stærð,stærð,aðalLitur));
                 repaint();
                 break;
             case 2:
                 allt.add(new Strokledur(x - stærð/2,y - stærð/2,stærð,stærð,this.getBackground()));
                 repaint();
                 break;
             case 3:
                 fletir [0] = new Lína(x0,y0,x,y,stærð,aðalLitur);
                 repaint();
                 break;
             case 4:
                 fletir [0] = new  Kassi(x0,y0,x,y,stærð,aðalLitur);
                 repaint();
                 break;
             case 5:
                 fletir [0] = new Hringur(x0,y0,x,y,stærð,aðalLitur);
                 repaint();
                 break;
         }
    }
    //fall sem eyðir Fötum
    private void eydaFletir(){
        if(fletir[0]!=null){
            fletir[0]=null;
        }
        repaint();
    }
    //fall sem teiknar kassa línu eða hringi þegar rétt skiliurði eru sett
    public void kassarLinurHringir(int x,int y){
        if(hverEr == 3){
            allt.add(new Lína(x0,y0,x,y,stærð,aðalLitur));
            eydaFletir();
        }else if(hverEr ==4){
            allt.add(new Kassi(x0,y0,x,y,stærð,aðalLitur));
            eydaFletir();
        }else if(hverEr == 5){
            
            allt.add(new Hringur(x0,y0,x,y,stærð,aðalLitur));
            eydaFletir();
        }
        
    }
    
    //fall til þess að vista pannelið sem mynd
    public void saveImg(String path){
        BufferedImage mynd = new BufferedImage(this.getWidth(),this.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = mynd.createGraphics();
        paint(g2);
        try{
            ImageIO.write(mynd, "png", new File(path+".png"));
        }
        catch(Exception  e){
            e.printStackTrace();
        }
    }
    
    //fall sem tieknar á pannelið
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        for(int i = 0;i<allt.size();i++){
            (allt.get(i)).Paint(g);
        }
        if(fletir[0]!=null){
             fletir[0].Paint(g);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
