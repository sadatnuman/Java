//for exit the program by entering 'q'.
import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an operation (basic, scientific, or q to quit): ");
            String operation = scanner.nextLine();

            if (operation.equals("basic")) {
                System.out.print("Enter the first number: ");
                double firstNumber = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double secondNumber = scanner.nextDouble();

                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                double result = 0;

                switch(operator) {
                    case '+':
                        result = firstNumber + secondNumber;
                        break;
                    case '-':
                        result = firstNumber - secondNumber;
                        break;
                    case '*':
                        result = firstNumber * secondNumber;
                        break;
                    case '/':
                        result = firstNumber / secondNumber;
                        break;
                    default:
                        System.out.println("Invalid operator");
                        return;
                }

                System.out.println("Result: " + result);

            } else if (operation.equals("scientific")) {
                System.out.print("Enter a number: ");
                double number = scanner.nextDouble();

                System.out.println("Select a scientific function:");
                System.out.println("1. Square root");
                System.out.println("2. Power of 2");
                System.out.println("3. Power of n");
                System.out.println("4. Natural logarithm");
                System.out.println("5. Sine");
                System.out.println("6. Cosine");
                System.out.println("7. Tangent");

                int function = scanner.nextInt();
                double result = 0;

                switch(function) {
                    case 1:
                        result = Math.sqrt(number);
                        break;
                    case 2:
                        result = Math.pow(number, 2);
                        break;
                    case 3:
                        System.out.print("Enter the exponent: ");
                        double exponent = scanner.nextDouble();
                        result = Math.pow(number, exponent);
                        break;
                    case 4:
                        result = Math.log(number);
                        break;
                    case 5:
                        result = Math.sin(number);
                        break;
                    case 6:
                        result = Math.cos(number);
                        break;
                    case 7:
                        result = Math.tan(number);
                        break;
                    default:
                        System.out.println("Invalid function");
                        return;
                }

                System.out.println("Result: " + result);

            } else if (operation.equals("q")) {
                break;
            } else {
                System.out.println("Invalid operation");
            }

            scanner.nextLine(); // Consume the remaining newline character
        }

        scanner.close();
    }
}
