package Ch7Array;

import java.util.RandomAccess;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class ExampleArray {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //begening array
//        int[] values=new int[5];
//        for (int i=1;i<5;i++){
//            values[i]=i+values[i-1];
//        }
//        values[0]=values[1]+values[4];
//        System.out.println();
//        for (int i:values){
//            System.out.println(i);
//        }


////Initialize array with input
//        System.out.println("enter size");
//        int size=input.nextInt();
//        int[] myList=new int[size];
//        System.out.println("Enter values ");
//       for(int i=0;i<myList.length;i++){
//            myList[i]=input.nextInt();
//       }
//for (int j:myList){
//    System.out.println(j);
//}

//double[] myList={1,8,9,4};
//double max=myList[3];
//for (int i=1;i<myList.length;i++) {
//    if (myList[i] > max)
//        max = myList[i];
//    System.out.println(myList[i]);
//}



///Analysis number
//        System.out.println("enter mumber");
//        int n= input.nextInt();
//        double[] numbers=new double[n];
//        double sum=0;
//        System.out.println("enter the numbers");
//        for (int i=0;i<n;i++){
//            numbers[i]=input.nextInt();
//            sum+=numbers[i];
//        }
//
//        double average=sum/n;
//        int count=0;//the number of element above average
//        for (int i=0;i<n;i++)
//            if (numbers[i]>average)
//                count++;
//        System.out.println("the sum of numbers is"+sum);
//        System.out.println("the average is"+average);
//        System.out.println("number of element above average is"+count);



        // Declare and create an array
//        char[] chars = createArray();
//
//        // Display the array
//        System.out.println("The lowercase letters are:");
//        displayArray(chars);
//
//        // Count the occurrences of each letter
//        int[] counts = countLetters(chars);
//
//        // Display counts
//        System.out.println();
//        System.out.println("The occurrences of each letter are:");
//        displayCounts(counts);
//    }
//
//    /** Create an array of characters */
//    public static char[] createArray() {
//        // Declare an array of characters and create it
//        char[] chars = new char[100];
//
//        // Create lowercase letters randomly and assign
//        // them to the array
//        for (int i = 0; i < chars.length; i++)
//            chars[i] =RandomCharacter.getRandomLowerCaseLetter();
//
//        // Return the array
//        return chars;
//    }
//
//    /** Display the array of characters */
//    public static void displayArray(char[] chars) {
//        // Display the characters in the array 20 on each line
//        for (int i = 0; i < chars.length; i++) {
//            if ((i + 1) % 20 == 0)
//                System.out.println(chars[i]);
//            else
//                System.out.print(chars[i] + " ");
//        }
//    }
//
//    /** Count the occurrences of each letter */
//    public static int[] countLetters(char[] chars) {
//        // Declare and create an array of 26 int
//        int[] counts = new int[26];
//
//        // For each lowercase letter in the array, count it
//        for (int i = 0; i < chars.length; i++)
//            counts[chars[i] - 'a']++;
//
//        return counts;
//    }
//
//    /** Display counts */
//    public static void displayCounts(int[] counts) {
//        for (int i = 0; i < counts.length; i++) {
//            if ((i + 1) % 10 == 0)
//                System.out.println(counts[i] + " " + (char)(i + 'a'));
//            else
//                System.out.print(counts[i] + " " + (char)(i + 'a') + "");
//}






    }

}
