import java.util.Scanner;

public class NaturalNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a number
        int number = scanner.nextInt();
        // Check if the number is a natural number (greater than 0)
        if (number > 0) {
            // Calculate the sum of first natural numbers using the formula n(n+1)/2
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}