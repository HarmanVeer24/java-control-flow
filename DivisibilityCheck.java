import java.util.Scanner;
//importing the Scanner class
class DivisibilityCheck{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int result = number%5;
	//checking if result is divisible by 5
	if(result ==0){
	System.out.println("The number "+number+" is divisible by 5");
	}
	else{
	System.out.println("The number "+number+" is not divisible by 5");
	}
    }
}
