package homeworks;

//Calculate the sum of the first 100 numbers higher than 0
    public class SumOfNumbers {
        public static void main(String args[]) {
            int sum = 0;
            for(int i = 1; i <= 100; i++ ) {
                sum = sum + i;
            }
            System.out.println("Suma primelor 100 nr este " + sum);

        }
    }