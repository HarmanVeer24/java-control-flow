import java.util.Scanner;

public class GreatestFactorFinder {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        int number = scanner.nextInt();
        
        // Check if the input is a positive integer
        if (number > 1) {
            int greatestFactor = 1;
            
            // Find the greatest factor excluding the number itself
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            
            // Display the greatest factor
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        } else {
            System.out.println("Please enter an integer greater than 1.");
        }
        
    }
}