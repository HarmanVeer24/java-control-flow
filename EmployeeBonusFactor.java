import java.util.Scanner;

public class EmployeeBonusFactor {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for salary and years of service
        double salary = scanner.nextDouble();
        int yearsOfService = scanner.nextInt();
        
        // Check if employee is eligible for a bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05; // 5% bonus calculation
            System.out.println("The employee is eligible for a bonus of: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}