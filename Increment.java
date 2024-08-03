package Ch6;

public class Increment {
    public static void main(String[] args) {
        int x=1;
        System.out.println("before the call, x is "+x);
        System.out.println("after the call, x is "+x);
    }
    public  static  void Increment(int n){
        n++;
        System.out.println("n inside the method is "+n);

    }
}
