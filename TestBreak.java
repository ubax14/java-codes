package Ch5;

public class TestBreak {
    public static void main(String[] args) {
        int sum=0;
        int number=0;
        while (number<20){
            number++;
            sum += number;
            if (sum>=100)
                break;
        }
        System.out.println("te number is "+number);
        System.out.println("the sum is "+sum);
    }
}
