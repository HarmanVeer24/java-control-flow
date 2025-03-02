import java.util.Scanner;

public class MultiplesFinder {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        int number = scanner.nextInt();
        
        // Check if the input is a valid positive integer less than 100
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100:");
            
            // Find and print multiples using a backward for loop
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a valid positive integer less than 100.");
        }
    }
}