import java.util.Scanner;
public class PositivenegativeZero {
    public static void main(String[] args){
        Double number ;
        Scanner input = new Scanner(System.in);
        System.out.print("\n\n\n");
        System.out.print("Enter a number : ");
        number = input.nextDouble();
        if(number > 0){
            System.out.println("Number is positive.");
        }
        else if(number < 0){
            System.out.println("Number is negative.");
        }
        else if(number == 0){
            System.out.println("Zero.");
        }
        else{
            System.out.print("It's not a number.");
        }
        System.out.print("\n\n\n");
    }
}