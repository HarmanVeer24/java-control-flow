import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        double total = 0.0; // Initialize total sum variable
        double number; // Variable to store user input
        
        // Prompt user for input
        number = scanner.nextDouble();
        
        // Loop until the user enters 0
        while (number != 0) {
            total += number; // Add user input to total
            number = scanner.nextDouble();
        }
        
        // Display the total sum
        System.out.println("The total sum is: " + total);
    }
}
