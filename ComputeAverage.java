import java.util.Scanner;//scanner is the java

public class ComputeAverage {
    public static void main(String[] args){
        //CREATE SCANNER OBJECT
        Scanner input= new Scanner(System.in);
        //PROMPT THE USER TO ENTER THREE NUMBERS
        System.out.print("ENTER THREE NUMBERS:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        //compute average
        double average =(number1+number2+number3)/3;
        //display result
        System.out.println("THE AVERAGE OF"+number1+" "+number2+" "+number3+"is  "+ average);
    }
}
