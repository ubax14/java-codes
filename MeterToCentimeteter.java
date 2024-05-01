import java.util.Scanner;

public class MeterToCentimeteter{
    public static void main(String[] args) {

    Scanner input =new Scanner(System.in);

    System.out.print("enter your distance in meter :");
    double cm=input.nextDouble();

    double centimeter =cm*100;


    System.out.println(centimeter+"centimeter is equal to :c"+cm+"meter.");

}    }

