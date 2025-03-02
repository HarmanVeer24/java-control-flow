import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        
        // Calculate sum of cubes of each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Extract last digit
            sum += digit * digit * digit; // Add cube of digit to sum
            originalNumber /= 10; // Remove last digit from number
        }
        
        // Check if number is Armstrong
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
