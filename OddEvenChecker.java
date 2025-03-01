import java.util.Scanner;
public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the number is natural (positive)
        if (number < 1) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        }
    }
}
