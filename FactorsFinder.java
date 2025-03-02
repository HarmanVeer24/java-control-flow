import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        int number = scanner.nextInt();
        
        // Check if the input is a positive integer
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
            // Find and print factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
    }
}
