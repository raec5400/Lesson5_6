package Lesson5;

import java.awt.Color;
import java.awt.Graphics;

public class Dice {

    private int value;
    private Graphics g;
    private Color c;
    private Color dc;
    //make the dice scalable
    private int size;
    private int dotSize;
    private int pos1, pos2, pos3;

    public Dice() {
        value = (int) (Math.random() * 6 + 1);
        g = null; //null = nothing
        c = null;
    }

    public Dice(Graphics pg, int s) {
        value = (int) (Math.random() * 6 + 1);
        c = Color.white;
        dc = Color.black;
        g = pg;
        size = s;
        dotSize = (int)(.167 * size);
        pos1 = (int)(.2 * size);
        pos2 = (int)(.4 * size);
        pos3 = (int)(.6 * size);
    }
    
    public void setColor(Color newc, Color newdc){
        c = newc;
        dc = newdc;
    }

    public void roll() {
        value = (int) (Math.random() * 6 + 1);
        // c = null; this was your problem
    }

    public int getValue() {
        return value;
    }

    public void draw() {
        if (g == null) {
            return;
        }
        g.setColor(c);
        g.fillRoundRect(dotSize, dotSize, (int)(.67 * size),(int)(.67 * size), 20, 20); //loc, size, curve

        //draw 7 dots
        g.setColor(dc);
        switch (value) {
            case 1:
                draw4();
                break;
            case 2:
                draw1();
                draw7();
                break;
            case 3:
                draw1();
                draw4();
                draw7();
                break;
            case 4:
                draw1();
                draw2();
                draw6();
                draw7();
                break;
            case 5:
                draw1();
                draw2();
                draw4();
                draw6();
                draw7();
                break;
            case 6:
                draw1();
                draw2();
                draw3();
                draw5();
                draw6();
                draw7();
                break;
            default:
                break;
        }
    }

    private void draw1() {
        g.fillOval(pos1, pos1, dotSize, dotSize);
    }

    private void draw2() {
        g.fillOval(pos3, pos1, dotSize, dotSize); //dot 2, r1
    }

    private void draw3() {
        g.fillOval(pos1, pos2, dotSize, dotSize); //dot 3, r2
    }

    private void draw4() {
        g.fillOval(pos2, pos2, dotSize, dotSize); //dot 4, r2
    }

    private void draw5() {
        g.fillOval(pos3, pos2, dotSize, dotSize); //dot 5, r3
    }

    private void draw6() {
        g.fillOval(pos1, pos3, dotSize, dotSize); //dot 6, r3
    }

    private void draw7() {
        g.fillOval(pos3, pos3, dotSize, dotSize); //dot 7, r3
    }

}
