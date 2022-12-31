import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args){
        double Fahrenheit ;
        Scanner input = new Scanner (System.in);
        System.out.println("\n\n\n");
        System.out.print("Enter Fahrenheit : ");
        Fahrenheit = input.nextDouble();
        double Celsius ;
        Celsius = 0.5555555 * (Fahrenheit - 32);
        System.out.println("Celsius : "+Celsius);
        System.out.println("\n\n\n");
    }
}
