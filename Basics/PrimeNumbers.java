public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            if (isPrime(i)) {
                int primeMultipliedBy3 = i * 3;
                System.out.println(primeMultipliedBy3);
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

