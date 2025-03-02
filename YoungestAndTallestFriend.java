import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for ages and heights
        int ageAmar = scanner.nextInt();
        int heightAmar = scanner.nextInt();        
        int ageAkbar = scanner.nextInt();
        int heightAkbar = scanner.nextInt();
        int ageAnthony = scanner.nextInt();
        int heightAnthony = scanner.nextInt();
        
        // Determine the youngest friend
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = (youngestAge == ageAmar) ? "Amar" : (youngestAge == ageAkbar) ? "Akbar" : "Anthony";
        
        // Determine the tallest friend
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = (tallestHeight == heightAmar) ? "Amar" : (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";
        
        // Display results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");
        
    }
}