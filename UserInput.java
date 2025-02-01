// UserInput.java
import java.util.Scanner;
class UserInput {
    private Scanner scanner = new Scanner(System.in);
    
    public int getMenuChoice() {
        System.out.println("Select an operation:");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Fibonacci\n6. Sum of Array\n7. Mean of Array\n8. Variance of Array\n9. Standard Deviation\n0. Exit");
        return scanner.nextInt();
    }
    
    public double[] getTwoNumbers() {
        System.out.println("Enter two numbers: ");
        return new double[]{scanner.nextDouble(), scanner.nextDouble()};
    }
    
    public int getSingleNumber() {
        System.out.println("Enter a number: ");
        return scanner.nextInt();
    }
    
    public double[] getArrayInput() {
        System.out.println("Enter the number of elements: ");
        int size = scanner.nextInt();
        double[] arr = new double[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
        }
        return arr;
    }
}
