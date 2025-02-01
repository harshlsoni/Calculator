// Calculator.java
class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public double sumArray(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }
    public double mean(double[] arr) {
        return sumArray(arr) / arr.length;
    }
    public double variance(double[] arr) {
        double mean = mean(arr);
        double variance = 0;
        for (double num : arr) {
            variance += Math.pow(num - mean, 2);
        }
        return variance / arr.length;
    }
    public double standardDeviation(double[] arr) {
        return Math.sqrt(variance(arr));
    }
}
