package Lesson6;

import javax.swing.JOptionPane;

public class GuessMachine {
    private int number, numGuesses, guess;
    
    public GuessMachine(){
        numGuesses=0;
        guess=0;
        number=(int)(Math.random()*100+1);
    }
    
    public String giveHint(){
        String s;
        if(guess<number)s = String.format("Number %d is too low.",guess);
        else if(guess>number)s = String.format("Number %d is too high.",guess);
        else {
            s= String.format("%d is the right number!",guess);            
        }
            return s;
    }
    
    public boolean setGuess(int num){
        boolean valid;
        guess=num;
        if(guess>=1 && guess<=100){
            valid=true;
            numGuesses++;
        }
        else {
            valid = false;
        }
        return valid;
    }
    public int getnumGuesses(){
        return numGuesses;
    }
}
