import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for month, day, and year
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
      
        // using the following formulas, for the Gregorian calendar
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;
		
        // using for output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth
        System.out.println("Day of the week : " + d0);
    }
}
