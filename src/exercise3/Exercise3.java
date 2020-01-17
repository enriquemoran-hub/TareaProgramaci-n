package exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        int divisor = 0;
        int currentNumber;
        // 6 y 28
        for (int i = 1; i <= 500; i++) {
            currentNumber = i;
            for (int j = 1; j < currentNumber; j++) {
                if (currentNumber % j == 0) {
                    // j  es divisor de currentNumber
                    divisor = j + divisor;
                }
            }
            if (divisor == currentNumber) {
                System.out.println("El número " + currentNumber + " es perfecto");
            }
            divisor = 0;
        }
    }
}
