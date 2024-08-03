package Ch6;

public class SumMethod {
    public static void main(String[] args) {
        System.out.println("the sum of 1 to 10 is"+sum(1,10));
        System.out.println("the sum of 10 to 20 is "+sum(10,20));
        System.out.println("the sum of 20 to 30 is "+sum(20,30));
    }

    public static int sum(int start,int end){
        int sum=0;
        for (int i=start;i<end;i++)
            sum+=i;
        return sum;
    }
}
