import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        int number = scanner.nextInt();
        
        // Handle the case when number is 0
        if (number == 0) {
            System.out.println("The number of digits is: 1");
            return;
        }

        int count = 0;
        int tempNumber = Math.abs(number); // Convert to positive for counting
        
        // Count digits using a loop
        while (tempNumber > 0) {
            tempNumber /= 10;  // Remove last digit
            count++;           // Increment count
        }

        // Display the result
        System.out.println("The number of digits is: " + count);
    }
}
