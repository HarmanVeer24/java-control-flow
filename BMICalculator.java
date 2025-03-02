import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        double weight = scanner.nextDouble();
        double heightCm = scanner.nextDouble();

        // Convert height to meters
        double heightM = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Determine BMI category
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display result
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Weight Status: " + status);
    }
}
