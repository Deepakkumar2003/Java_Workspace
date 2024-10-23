import java.util.Scanner;

public class DiagonalSumAndNivenChec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();
        
        int[][] matrix = new int[size][size];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int diagonalSum = calculateDiagonalSum(matrix);
        
        System.out.println("Sum of diagonal elements: " + diagonalSum);
        
        if (isNivenNumber(diagonalSum)) {
            System.out.println(diagonalSum + " is a Niven number.");
        } else {
            System.out.println(diagonalSum + " is not a Niven number.");
        }
        
        scanner.close();
    }
    
    public static int calculateDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // Add elements from the main diagonal
        }
        return sum;
    }
    
    public static boolean isNivenNumber(int number) {
        int sumOfDigits = 0;
        int originalNumber = number;
        
        while (number != 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }
        
        return originalNumber % sumOfDigits == 0;
    }
}
