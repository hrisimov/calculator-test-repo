public class Calculator {

    // Method for addition. Updated from GitHub
    public double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction. Updated locally
    // Method for subtraction. Updated from GitHub
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public double multiply(double a, double b) {
        return a * b;
    }


    // Method for division
	// There is a check for deletion by zero

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Main method for testing the calculator
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double num1 = 10.5;
        double num2 = 5.5;

        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));
    }
}
