package Ch6;

public class PrimeNumber {
    public static void main(String[] args) {

        int count = 0, number = 2;
        Boolean isPrime;

        while (count < 50) {

            isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count % 10 == 0)
                    System.out.println(number);
                else
                    System.out.printf("%-5d", number);
            }
            number++;
        }
    }

}
