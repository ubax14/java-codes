import java.util.Scanner;

public class RepeatAdditionQuize {
    public static void main(String[] args) {
        int number1 = (int)(Math.random()*100);
        int number2 = (int)(Math.random()*100);
        //create scanner
        Scanner input= new Scanner(System.in);
        System.out.println("what is "+number1+"+"+number2+" ?");
        int answare = input.nextInt();
        while (number1+number2 !=answare){
            System.out.println("wrong answare. Tray again what is "+number1+"+"+number2+"?");
             answare=input.nextInt();
        }
        {
            System.out.println("your answare is correct ");
        }
    }
}