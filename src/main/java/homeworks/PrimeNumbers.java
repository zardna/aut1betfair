package homeworks;

//Display all the prime numbers lower than 1 000 000
public class PrimeNumbers {
    public static void main(String args[]) {
        for (int i = 2; i <= 100000; i++) {
            boolean isPrime = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i);
            }
        }
    }
}
