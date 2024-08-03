package Ch5;

import java.util.Scanner;

public class GuessNumberUsingBreak {
    public static void main(String[] args) {
        int number =(int)(Math.random()*101);
        Scanner input = new Scanner(System.in);
        System.out.println("guess magic  number between 0 and 100");
        while (true){
            System.out.println("\nEnter your guess ");
            int guess=input.nextInt();
            if(guess==number){
                System.out.println("yes the number is "+number);
                break;
            } else if (guess>number) {
                System.out.println("your guess is too height");

            }
            else
                System.out.println("your guess is too low");

        }


//        int x=2;
//        while (x<=20){
//            System.out.println(x);
//            x+=2;
//        }
//        for(int x=0; x<20;x+=2);{
//
//
//        }
}}
