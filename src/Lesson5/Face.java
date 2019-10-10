package Lesson5;

import java.awt.Color;
import java.awt.Graphics;

public class Face {
    private int xPos, yPos, diameter;
    private boolean isHappy;
    private Color color, eyecol;
    private Graphics g;
    
    public Face(Graphics g, int x, int y){
        xPos=x;
        yPos=y;
        this.g = g; //"g" property = "g" param
        //default size and color
        diameter=100;
        color=Color.red;
        eyecol=Color.yellow;
        isHappy = true;
    }
    
    public void setColor(Color newface, Color neweyes){
        color = newface;
        eyecol = neweyes;
    }
    public void move(int newx, int newy){
        xPos=newx;
        yPos=newy;
    }   
    public void Resize(int newdi){
        diameter= newdi;
               
    }
    public boolean toggleMood(){
        if(isHappy)
            isHappy=false;
        else if(isHappy==false)
            isHappy=true;
        return isHappy;
    }
    
    public void draw(){
        drawHead();
        drawEyes();
        if(isHappy==false){
            g.drawLine((int)(xPos+.35*diameter), (int)(yPos+.9*diameter), (int)(xPos+.4*diameter), (int)(yPos+.85*diameter));
            g.drawLine((int)(xPos+.4*diameter), (int)(yPos+.85*diameter), (int)(xPos+.6*diameter), (int)(yPos+.85*diameter));
            g.drawLine((int)(xPos+.6*diameter), (int)(yPos+.85*diameter), (int)(xPos+.65*diameter), (int)(yPos+.9*diameter));
        }
        else drawMouth();
                   
    }
    private void drawHead(){
        g.setColor(color);
        g.fillOval(xPos, yPos, diameter, diameter);
    }
    private void drawEyes(){
        g.setColor(eyecol);
        g.fillOval((int)(xPos+0.25*diameter), (int)(yPos+0.4*diameter), (int)(diameter*.2), (int)(diameter*.2));
        g.fillOval((int)(xPos+0.55*diameter), (int)(yPos+0.4*diameter), (int)(diameter*.2), (int)(diameter*.2));
    }
    private void drawMouth(){      
        g.drawLine((int)(xPos+.35*diameter), (int)(yPos+.8*diameter), (int)(xPos+.4*diameter), (int)(yPos+.85*diameter));
        g.drawLine((int)(xPos+.4*diameter), (int)(yPos+.85*diameter), (int)(xPos+.6*diameter), (int)(yPos+.85*diameter));
        g.drawLine((int)(xPos+.6*diameter), (int)(yPos+.85*diameter), (int)(xPos+.65*diameter), (int)(yPos+.8*diameter));
    }
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xPos-10, yPos-10, diameter+20, diameter+20);
    }
}
