import java.util.Scanner;

public class CarsValue {
    public static void main(String[] args) {
        final double tax=65;
        String carname="toyota";
         String carmodaL="AB445V";

        Scanner input= new Scanner(System.in);
        System.out.println("enter car valpue ");
        int  carprice=input.nextInt();
        //String carname= input.nextLine();
       // String carmodal= input.nextLine();
         double total= carprice*tax;
        System.out.println("poc total is"+total+"THE" + " CARNAME IS:"+carname+" the car model is:"+carmodaL);







    }

}
