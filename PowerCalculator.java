import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for base number and power input
        int number = scanner.nextInt();
        int power = scanner.nextInt();
        
        // Check if the input values are valid positive integers
        if (number > 0 && power >= 0) {
            int result = 1;
            
            // Compute power using a for loop
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            
            // Display the result
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        } else {
            System.out.println("Please enter a valid positive integer for base and a non-negative integer for power.");
        }
    }
}
