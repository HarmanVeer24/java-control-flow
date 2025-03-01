import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        int number = scanner.nextInt();
        
        // Check if the input is a natural number
        if (number > 0) {
            // Iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        } else{
            System.out.println("The entered number is not a natural number.");
        }
    }
}
