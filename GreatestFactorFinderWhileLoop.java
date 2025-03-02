import java.util.Scanner;

public class GreatestFactorFinderWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        int number = scanner.nextInt();
        
        // Check if the input is a positive integer
        if (number > 1) {
            int greatestFactor = 1;
            int counter = number - 1;
            
            // Find the greatest factor excluding the number itself using while loop
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            
            // Display the greatest factor
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        } else {
            System.out.println("Please enter an integer greater than 1.");
        }
        
    }
}