import java.util.Scanner;
public class SmallestNumberCheck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for three number
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        // Checking if the first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Displaying the result
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}