package Ch6;

public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;
        System.out.println("before swap method number1= " + num1 + ", number2= " + num2);
        swap(num1,num2);
        System.out.println("after calling swap method number1= " + num1 + ", number2= " + num2);

    }
    public static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("after swap inside method number1= "+num1+", number2= "+num2);
    }
}
