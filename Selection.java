//import java.util.Scanner;
//
//public class Selection {
//    public static void main(String[]args){
//        int num1=(int)(System.currentTimeMillis()%10);
//        int num2=(int)(System.currentTimeMillis()/10%10);
//        Scanner input = new Scanner(System.in);
//        System.out.println("what is"+num1+"+"+num2+"?");
//        int answare =input.nextInt();
//        System.out.println(num1+"+"+num2+"="+answare+"is"+(num1+num2==answare)+" "+"the coreect answere is"+" "+(num1+num2));
//    }
//}


//import java.util.Scanner;
//
//public class Selection {
//    public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//        System.out.println("enter integer number");
//        int number=input.nextInt();
//        if(number%5==0)
//            System.out.println("hi five");
//        if (number%2==0)
//            System.out.println("hi  even");
//
//    }
//}


import java.util.Scanner;
//
//public class Selection {
//    public static void main(String[] args) {
////generate two random single-digit integers
//int num1=(int)(Math.random()*10);
//int num2=(int)(Math.random()*10);
////2.if number1<number2, swap number1 with number2
//        if (num1<num2){
//            int temp=num1;
//            num1=num2;
//            num2=temp;
//        }
//        //3. promt the student to answere  "what is number1- number2?"
//        System.out.println("what is"+num1+"-"+num2);
//        Scanner input=new Scanner(System.in);
//        int answare= input.nextInt();
//        //grade the answare and display the result
//        if (num1-num2==answare)
//            System.out.println("you are correct");
//        else{
//            System.out.println("you are wrong");
//            System.out.println(num1+"-"+num2+"should be"+(num1-num2));
//        }
//    }
//}

//public class Selection {
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter whigts in pound");
//        double weight= input.nextDouble();
//        System.out.println("enter hei in pound");
//        double hieght= input.nextDouble();
//        final double killogrms_per_pound=0.4532;
//        final double mettere_per_inch=0.0254;
//        double weight_killo_gram=weight*killogrms_per_pound;
//        double heigtmetrs=hieght*mettere_per_inch;
//        double bmi= weight_killo_gram/(heigtmetrs*heigtmetrs);
//        System.out.println("bmi is"+bmi);
//        if (bmi<18.5)
//            System.out.println("underweight");
//        else if (bmi<25)
//            System.out.println("normal");
//
//        else if (bmi<30)
//            System.out.println("overweight");
//        else
//            System.out.println("obese");
//    }
//}


//public class Selection {
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter a number");
//        int num=input.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("satur");break;
//            case 2:
//                System.out.println("sund");break;
//            case 3:
//                System.out.println("monday");break;
//            case 4:
//                System.out.println("tuesd");break;
//            case 5:
//                System.out.println("wedn");break;
//            case 6:
//                System.out.println("thurd");break;
//            case 7:
//                System.out.println("friday");break;
//            default:
//                System.out.println("invalid day");
//        }
//    }
//}


//public class Selection {
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter a number");
//        String day=input.next();
//        switch (day){
//            case "sat":
//                System.out.println("day1");break;
//            case "sun":
//                System.out.println("da2");break;
//            case "mon":
//                System.out.println("day3");break;
//            case "tues":
//                System.out.println("day4");break;
//            case "wedn":
//                System.out.println("day5");break;
//            case "thur":
//                System.out.println("day6");break;
//            case "friday":
//                System.out.println("day7");break;
//            default:
//                System.out.println("invalid day");
//        }
//    }
//}

//public class Selection {
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter opreator(+,-,*,/)");
//            String opert=input.next();
//        System.out.println("enter two numbers");
//        int num1=input.nextInt();
//        int num2=input.nextInt();
//        switch (opert){
//            case "+":
//                System.out.println(num1+num2);break;
//            case "-":
//                System.out.println(num1-num2);break;
//            case "*":
//                System.out.println(num1*num2);break;
//            case "/":
//                System.out.println(num1/num2);break;
//            default:
//                System.out.println("invalid operator");
//        }
//
//    }
//}
//
//public class Selection {
//    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//        System.out.println("enter a year");
//        int year= input.nextInt();
//        boolean isleapyear=(year%4==0&& year%100!=0)||(year%400==0);
//        System.out.println(year+"is year leap"+" "+isleapyear);
//    }
//}

//public class Selection {
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//
//        System.out.println("enter number which is higher than 0");
//        int number= input.nextInt();
//        if (number<=0) {System.out.println("please enter number greter than 0");}
//          if (number%5==0)
//            System.out.println("buzz");
//        else if (number%3==0)
//            System.out.println("fizz");
//        else if (number % 5 == 0 && number % 3 == 0){
//            System.out.println("fizzbuzz");
//        }
//
//        else
//            System.out.println("CAN'T DEVIDE BOTH OF THEM");
//    }
//
//}


