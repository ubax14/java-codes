package Ch5;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        final int NUMBEROFQUESTIONS=5;
        int count=0;
        int correct=0;
        int incorect=0;
        String output="";
        while (count<NUMBEROFQUESTIONS){
            int numb1=(int) (Math.random()*10);
            int numb2=(int) (Math.random()*10);
            if (numb2>numb1){
                int temp=numb1;
                numb1=numb2;
                numb2=temp;
            }
            System.out.println("what is "+numb1+"-"+numb2+" ?");
            Scanner input= new Scanner(System.in);
            int answ=input.nextInt();
            if (numb1-numb2==answ){
                System.out.println("your answere is right");
                correct++;
            }
            else {
                System.out.println("your answare is wrong");
                incorect++;
            }
            count++;
            output+="\n what is "+numb1+"-"+numb2+"?"+answ+((numb1-numb2==answ)?"right":"wrong");

        }
        System.out.println("number of correct answer is :"+correct);
        System.out.println("number of incorrect is :"+incorect);
        System.out.println(output);
    }
}
