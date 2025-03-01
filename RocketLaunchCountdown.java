import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a countdown start value
        int counter = scanner.nextInt();
        
        // Countdown using a while loop
        while (counter >= 1){
            System.out.println(counter);
            counter--;
        }
    }
}
