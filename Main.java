// Main.java
public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();
        
        int choice;
        do {
            choice = userInput.getMenuChoice();
            switch (choice) {
                case 1: // Addition
                    double[] addNums = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.add(addNums[0], addNums[1]));
                    break;
                case 2: // Subtraction
                    double[] subNums = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.subtract(subNums[0], subNums[1]));
                    break;
                case 3: // Multiplication
                    double[] mulNums = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.multiply(mulNums[0], mulNums[1]));
                    break;
                case 4: // Division
                    double[] divNums = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.divide(divNums[0], divNums[1]));
                    break;
                case 5: // Fibonacci
                    int n = userInput.getSingleNumber();
                    System.out.println("Fibonacci(" + n + ") = " + calculator.fibonacci(n));
                    break;
                case 6: // Sum of Array
                    double[] arr = userInput.getArrayInput();
                    System.out.println("Sum: " + calculator.sumArray(arr));
                    break;
                case 7: // Mean of Array
                    arr = userInput.getArrayInput();
                    System.out.println("Mean: " + calculator.mean(arr));
                    break;
                case 8: // Variance of Array
                    arr = userInput.getArrayInput();
                    System.out.println("Variance: " + calculator.variance(arr));
                    break;
                case 9: // Standard Deviation of Array
                    arr = userInput.getArrayInput();
                    System.out.println("Standard Deviation: " + calculator.standardDeviation(arr));
                    break;
                case 0: // Exit
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 0);
    }
}
