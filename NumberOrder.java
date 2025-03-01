import java.util.Scanner;

public class NumberOrder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for input
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        // Checking which number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        // Displaying the result
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
}
