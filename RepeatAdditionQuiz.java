package Ch5;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        //create scanner
        Scanner input=new Scanner(System.in);
        System.out.println("what is "+num1+"+"+num2+"?");
        int ans= input.nextInt();
        while (num1+num2!=ans){
            System.out.println("Wrong answer.Tray again what is"+num1+"+"+num2+"?");
            ans= input.nextInt();
        }
        System.out.println("you got it !");
    }
}
