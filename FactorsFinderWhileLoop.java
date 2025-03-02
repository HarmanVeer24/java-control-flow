import java.util.Scanner;

public class FactorsFinderWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        int number = scanner.nextInt();
        
        // Check if the input is a positive integer
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
            
            // Initialize counter variable
            int i = 1;
            
            // Find and print factors using while loop
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++; // Increment counter
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
    }
}
