package Ch7Array;

import java.util.Scanner;

public class StudentRegistrationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] id = new int[5];
        for (int i = 0; i < id.length; i++) {
            System.out.println("enter student  id" + (i + 1));
            id[i] = input.nextInt();
            int j = id[i];
            if (j == i) {
                System.out.println("enter new number id"+(i+1));
                i = input.nextInt();
            }

        }
        String[] stdName = new String[5];
        for (int i = 0; i < stdName.length; i++) {
            System.out.println("enter student  name"+i + (i + 1));
            stdName[i] = input.next();


        }
        studenResgstration(id,stdName);
    }
    public static void studenResgstration(int[] stdId,String[] sdname){

        for(int i:stdId){
            System.out.println("student id"+i);
        }
for (String j:sdname){
    System.out.println("student name"+j);
}
        }
}
