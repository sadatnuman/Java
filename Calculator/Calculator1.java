import java.util.Scanner;

public class Calculator1 {
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

        // Perform the calculations
        while (true) {
            System.out.print("Enter an operator (+, -, *, /) or 'q' to quit: ");
            char operator = scanner.next().charAt(0);

            if (operator == 'q') {
                break;
            }

            System.out.print("Enter the second input: ");
            double secondInput = scanner.nextDouble();

            switch(operator) {
                case '+':
                    for (int i = 0; i < numInputs; i++) {
                        inputs[i] += secondInput;
                    }
                    break;
                case '-':
                    for (int i = 0; i < numInputs; i++) {
                        inputs[i] -= secondInput;
                    }
                    break;
                case '*':
                    for (int i = 0; i < numInputs; i++) {
                        inputs[i] *= secondInput;
                    }
                    break;
                case '/':
                    for (int i = 0; i < numInputs; i++) {
                        inputs[i] /= secondInput;
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    return;
            }
        }

        // Display the final inputs and result
        System.out.print("Final inputs: ");
        for (int i = 0; i < numInputs; i++) {
            System.out.print(inputs[i] + " ");
        }
        System.out.println();
    }
}
