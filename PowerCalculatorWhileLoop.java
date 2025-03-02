import java.util.Scanner;

public class PowerCalculatorWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for base number and power input
        int number = scanner.nextInt();
        int power = scanner.nextInt();
        
        // Check if the input values are valid
        if (number > 0 && power >= 0) {
            int result = 1;
            int counter = 0;
            
            // Compute power using a while loop
            while (counter < power) {
                result *= number;
                counter++;
            }
            
            // Display the result
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        } else {
            System.out.println("Please enter a valid positive integer for base and a non-negative integer for power.");
        } 
    }
}
