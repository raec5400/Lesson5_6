package Lesson5;

public class Lucky7 {

    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        
        
        int tries=0;
        while(true){
        d1.roll();
        d2.roll();
        tries++;
        int total = d1.getValue() + d2.getValue();    
        System.out.print("Try: " + tries + "\t");
        System.out.format("You rolled a %d and a %d for a total of %d\n", d1.getValue(), d2.getValue(), total);
        if(total == 2) break;
        }
        System.out.println("It took " + tries + " tries to get snake-eyes.");
    }
    
}
