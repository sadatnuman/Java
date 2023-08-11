import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of inputs
        System.out.print("Enter the number of inputs: ");
        int numInputs = scanner.nextInt();

        double[] inputs = new double[numInputs];

        // Get the inputs
        for (int i = 0; i < numInputs; i++) {
            System.out.print("Enter input #" + (i+1) + ": ");
            inputs[i] = scanner.nextDouble();
        }

        // Get the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = inputs[0];

        // Perform the calculation based on the operator
        for (int i = 1; i < numInputs; i++) {
            switch(operator) {
                case '+':
                    result += inputs[i];
                    break;
                case '-':
                    result -= inputs[i];
                    break;
                case '*':
                    result *= inputs[i];
                    break;
                case '/':
                    result /= inputs[i];
                    break;
                default:
                    System.out.println("Invalid operator");
                    return;
            }
        }

        // Display the result
        System.out.println("Result: " + result);
    }
}
