package Lesson5;

import java.awt.Color;
import java.awt.Graphics;

public class Face {
    private int xPos, yPos, newpos, diameter, eyediam;
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
    public int move(int newxpos, int newypos){
        newxpos=(int)(Math.random()*50+5);
        newypos=(int)(Math.random()*50+5);
        return newpos;       
    }
    public void Resize(){
        
    }
    
    public void draw(){
        drawHead();
        drawEyes();
        drawMouth();
        
            
    }
    private void drawHead(){
        g.fillOval(xPos, yPos, diameter, diameter);
    }
    private void drawEyes(){
        g.fillOval(xPos, yPos, eyediam, eyediam);
        g.fillOval(xPos, yPos, eyediam, eyediam);
    }
    private void drawMouth(){
        g.drawLine(xPos, yPos, xPos, yPos);
        g.drawLine(xPos, yPos, xPos, yPos);
        g.drawLine(xPos, yPos, xPos, yPos);
    }
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xPos-10, yPos-10, diameter+20, diameter+20);
    }
}
