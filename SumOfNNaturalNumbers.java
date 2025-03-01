import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        int n = scanner.nextInt();
        
        // Check if the input is a natural number
        if (n > 0) {
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;
            
            // Compute sum using while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }
            
            // Display the results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
            
            // Verify if both results match
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is a mismatch in the computations.");
            }
        } else {
            System.out.println("The entered number is not a natural number.");
        }
    }
}
