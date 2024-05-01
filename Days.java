import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        //meeting day of the weak
        int dayofWeak,meetday;
        final int weekdays=7;
        Scanner input=new Scanner(System.in);
        System.out.println("enter day of the week");
        dayofWeak=input.nextInt();
        meetday=(dayofWeak+10)%weekdays;
        System.out.println("meeting day of the week:"+meetday);
    }
}
