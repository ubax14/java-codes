//public class ComputerArea {
//    public static void main(String[] args){
//        double radius;//declare radius
//        double area;//declare aria
//        //assign a radius
//        radius =20; //new values is radius
//        //compute area
//        area=radius*radius*3.14159;
//        //display result
//        System.out.println("there area for the circle of radius: "+radius+"is"+area);
//    }
//}


import java.util.Scanner;

public class ComputerArea {
    public static void main(String[]args){
        //create scanner
        Scanner input= new Scanner(System.in);
        System.out.println("enter number of radius ");
        double radius= input.nextDouble();
        double area=radius*radius*3.14159;
        System.out.println("the area of circle is "+radius+"is "+area);
    }
}


