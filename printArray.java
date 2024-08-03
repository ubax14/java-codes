package Ch7Array;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

import java.lang.reflect.Array;
import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
//        int target=6;
//        int index=0;
//     int[] evennumbers={2,4,6,8,10};
//     int[] newArray=new int[evennumbers.length-1];
//     for (int i=0;i<evennumbers.length;i++){
//         if (evennumbers[i]!=target){
//             newArray[index++]=evennumbers[i];
//         }
//     }
//        for (int j:newArray){
//            System.out.println(j);
//        }





       int[] numbers= new int[5];
       Scanner input=new Scanner(System.in);
       for(int i=0;i<numbers.length;i++){
           System.out.println("enter element "+(i+1));
           numbers[i]= input.nextInt();
       }
       int odd=0;
       int even=0;
       for (int value:numbers){
           if (value%2==0)
               even++;
           else
               odd++;
       }
        System.out.println("the number of even is"+even+" and odd is "+odd );


//        System.out.println("enter size");
//        int size= input.nextInt();
//        System.out.println("enter numbers");
//        int number= input.nextInt();
//

 //printArray();
 evenAndOdd();

    }



//    public static void printArray(){
//        int[] numbers=new int[5];
//        for (int i=0;i<numbers.length;i++){
//            Scanner input=new Scanner(System.in);
//            numbers[i]= input.nextInt();
//        }
//        int sum=0;
////        numbers[0]=5;
////        numbers[1]=4;
////        numbers[2]=3;
////        numbers[3]=8;
////        numbers[4]=10;
//        for (int i=0;i<numbers.length;i++){
//            System.out.print(numbers[i]+" ");
//            sum+=numbers[i];
//        }
//    }

    public static void evenAndOdd(){
        int[] numArray=new int[4];
        numArray[0]=1;
        numArray[1]=2;
        numArray[2]=3;
        numArray[3]=4;
        for (int i=0;i<numArray.length;i++){
            if (numArray[i]%2==0){
                System.out.println(numArray[i]+" is even");
            }
            else {
                System.out.println(numArray[i]+" is odd");
            }
        }
    }


}
