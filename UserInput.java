// User Inputa
import java.util.Scanner;
public class UserInput {
	int[] UserInput() {
	int[] numbers = new int[2];
	Scanner scan = new Scanner(System.in);
	System.out.println("enter first number: ");
	numbers[0] = scan.nextInt();
	System.out.println("enter second number: ");
	numbers[1] = scan.nextInt();
	
	return numbers; // java cannot return multiple variables like (a,b) so we use array
	}

}