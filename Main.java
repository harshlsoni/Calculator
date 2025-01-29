//main.java
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		System.out.println("Name of operator: ");
		Scanner scan = new Scanner(System.in);
		String op = scan.nextLine();
		Calculator calc = new Calculator();
		if(op.equals("add")) {
			System.out.println("The sum of two nums is : " + calc.sum());
		}
		else if(op.equals("sub")) {
			System.out.println("The subtract of two nums is : " + calc.sub());
		}
		else if(op.equals( "multiply")) {
			System.out.println("The product of two nums is : " + calc.multi());
		}
		else if (op.equals("divide"))  {
			System.out.println("The division of two nums is : " + calc.div());
		}
		else {
			System.out.println("Wrong operator...");
		}
	}
}