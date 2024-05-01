//public class charnumber{
//    public static void main(String[] args) {
//        char ch=(char)('0'+Math.random()*('z'-'a'+1));
//        System.out.println("the  generated later is"+" "+ch);
//        if ('A'<= ch && ch <= 'Z')
//            System.out.println("the generated later is uppercase");
//        else if ('a'<= ch && ch <='z')
//            System.out.println("the  generated later is lowercase");
//        else if ('0'<= ch && ch <='9')
//            System.out.println("the generated later is digit");
//         else
//            System.out.println("the generated later  is not a valid later");
//
//
//
//    }
//}


public class charnumber {
    public static void main(String[] args) {
        String myNameUpper="ubah salah";
        String myNameLower="UBAH SALAH";
        System.out.println(myNameUpper.charAt(5));
        System.out.println(myNameUpper.substring(7));
        System.out.println(myNameUpper.indexOf('h'));
        String capitalLetter=myNameUpper.toUpperCase();
        System.out.println("capital later of my name is:"+capitalLetter);
        String smallLetter=myNameLower.toLowerCase();
        System.out.println("small later of my name is:"+smallLetter);
    }
}

//public class charnumber {
//    public static void main(String[] args) {
//        char ch1='A';
//        char ch2='1';
//        char ch3='*';
//        char ch4='$';
//        boolean b1=Character.isLetterOrDigit(ch1);
//        boolean b2=Character.isLetterOrDigit(ch2);
//        boolean b3=Character.isLetterOrDigit(ch3);
//        boolean b4=Character.isLetterOrDigit(ch4);
//        String str1="the first character"+" "+ch1+" "+"is letter or digit:"+b1;
//        String str2="the second character"+" "+ch2+" "+"is letter or digit:"+b2;
//        String str3="the third character"+" "+ch3+" "+"is letter or digit:"+b3;
//        String str4="the fourth character"+" "+ch4+" "+"is letter or digit:"+b4;
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);
//
//    }
//}


//import java.util.Scanner;

//public class charnumber {
//   public static void main(String[] args) {
//      char  letter=(char) ('0'+Math.random()*('z'-'a'+1));
//        System.out.println("the genereted letter is: "+letter);
//       if ('a'<=letter && letter<='z'||'A'<=letter && letter<='Z')
//      System.out.println("the character is  letter: "+letter);
//       else if ('A'<=letter && letter<='Z' ||'a'<= letter && letter<='z'|| '0'<= letter && letter <= '9'){
//           System.out.println("is letter or digit: "+letter);
//       } else System.out.println("the generated is not valid");
//    }
//}


//public class charnumber {
//    public static void main(String[] args) {
//        char letter = (char) ('0' + Math.random() * ('z' - 'a' + 1));
//        if ('a' <= letter && letter <= 'z') {
//            System.out.println(letter + " from lower case to upper case"+" "+Character.toUpperCase(letter));
//        } else if ('A' <= letter && letter <= 'Z') {
//            System.out.println(letter+" "+"from upper case to lower case"+" "+Character.toLowerCase(letter));
//        }
//        else System.out.println("invalid");
//    }}
