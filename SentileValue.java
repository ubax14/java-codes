package Ch5;

import java.util.Scanner;

public class SentileValue {
    public static void main(String[] args) {
        //create scanner
        Scanner input=new Scanner(System.in);
        System.out.println("Enter integer(the input ends if it is 0):");
        int data= input.nextInt();
        int sum=0;
        while (sum!=0){
            sum+=data;
            System.out.println("Enter an integer (the input ends if it is 0)");
            data= input.nextInt();
        }
        System.out.println("sum is "+sum);
    }
}
