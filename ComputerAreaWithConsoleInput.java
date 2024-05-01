import java.util.Scanner;//scanner is in the java.until package

public class ComputerAreaWithConsoleInput {
    public static  void main(String[] args){
        //CREATE SCANNER OBJECT
        Scanner input =new Scanner(System.in);
        //prompt the user to enter a radius
        System.out.println("enter a number for radius:");
        double radius =input.nextDouble();
        //compute area
        double area = radius*radius*3.14159;
        //display result
        System.out.println("the area for the circle of radius: "+radius+"is"+area);
    }
}
