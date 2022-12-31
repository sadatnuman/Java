import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
        double Celsius ;
        Scanner input = new Scanner (System.in);
        System.out.println("\n\n\n");
        System.out.print("Enter Celsius : ");
        Celsius = input.nextDouble();
        double Fahrenheit ;
        Fahrenheit = 1.8 * Celsius + 32;
        System.out.println("Fahrenheit : "+Fahrenheit);
        System.out.println("\n\n\n");
    }
}
