package Lesson5;

import java.util.Scanner;

public class Lucky7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        int money , maxmoney ;
        int tries = 0, besttry =0;
/*
        while (true) {
            System.out.print("Enter the amount of money you want to gamble (integers only): ");
            try {
                money = s.nextInt();
                maxmoney = s.nextInt();
            } catch (Exception e) {
                System.out.println("Error - Must enter integers only.");
                s.nextLine();
                continue;              
            }
             if (money < 1) {
                System.out.println("Enter number 1 or more.");
            }
             else break;
        }
*/
       System.out.print("Enter the amount of money you want to gamble: ");
            
                money = s.nextInt();
                maxmoney = s.nextInt();
        while (true){
            d1.roll();
            d2.roll();
            tries++;
            int total = d1.getValue() + d2.getValue();
            

                if (total != 7) {
                    money-=1;
                }
                if (total == 7) {
                    money +=4;
                }
                
                if (money > maxmoney) {
                    money = maxmoney;
                    besttry = tries;
                }
                else if (money == 0) {
                    System.out.format("You were broke after %d tries\n", tries);
                    System.out.format("You should have quit after %d tries when you had %d\n", besttry, maxmoney);
                    break;
                }                       
            }
           
        }
    
    }


