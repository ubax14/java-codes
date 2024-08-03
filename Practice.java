package Ch7Array;
import java.util.Scanner;
public class Practice {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("enter a number");
            int num= input.nextInt();
            //print numbers
            printNumbers(num);
            System.out.println();
            //sum numbers
            int result= sumNumbers(num);
            System.out.println("the sum of numbers from 1 to "+num+" : "+ result);
            // foctoria
            int product=foctoria(num);
            System.out.println("Foctorai of "+num+" : "+product);
            //even numbers
            EvenNumbers(num);
        }
        //print numbers funtion

        public static void printNumbers (int n){
            int[] list=new int[n];
            System.out.print("Numbers from 1 to "+n+" :");
            for(int i=0;i<list.length;i++){
                list[i]=i+1;
                System.out.print(list[i]+" ");

            }

        }
        //sum function
        public static int sumNumbers(int n){
            int sum=0;


            for (int i=1;i<=n;i++){
                sum+=i;

            }
            return sum;
        }
        //foctorai function
        public static int foctoria(int n){

            int product=1;
            for (int i=1;i<=n;i++){
                product*=i;
            }
            return product;
        }
        // Even Numbers function
        public static void EvenNumbers(int n){
            System.out.print("Even numbers from 1 to "+n+" : ");
            for (int i=1;i<=n;i++){
                if (i%2==0)
                    System.out.print(i+" ");
  }
}

    }

