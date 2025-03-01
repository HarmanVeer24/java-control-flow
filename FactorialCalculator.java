import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        int n = scanner.nextInt();
        
        // Check if the input is a positive integer
        if (n >= 0) {
            // Compute factorial using while loop
            long factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }
            
            // Display the result
            System.out.println("Factorial of " + n + " is: " + factorial);
        } else {
            System.out.println("The entered number is not a positive integer.");
        }
    }
}