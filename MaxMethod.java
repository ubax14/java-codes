package Ch6;

public class MaxMethod {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = max(a, b);
        System.out.println("The maximum number of " + a + " and " + b + " is " + c);
        System.out.println("The maximum of 8 and 3 is " + max(8, 3));
        System.out.println("The maximum of 8, 5, 2 is " + max(8, 5, 2));
    }

    public static int max(int num1, int num2) {
        int max;
        if (num1 > num2)
            max = num1;
        else
            max = num2;
        return max;
    }

    public static int max(int num1, int num2, int num3) {
        int max;
        if (num1 >= num2 && num1 >= num3)
            max = num1;
        else if (num2 >= num1 && num2 >= num3)
            max = num2;
        else
            max = num3;
        return max;
    }
}
