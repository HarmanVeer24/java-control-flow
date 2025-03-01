import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        double total = 0.0; // Initialize total sum variable
        
        // Infinite loop to continuously take user input
        while (true) {
            double number = scanner.nextDouble(); // Take user input
            
            // Check if the entered number is 0 or negative
            if (number <= 0) {
                break;
            }
            
            total += number; // Add user input to total
        }
        
        // Display the total sum
        System.out.println("The total sum is: " + total);
        
    }
}