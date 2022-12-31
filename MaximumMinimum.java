import java.util.Scanner;

public class MaximumMinimum {
    public static void main(String[] args){
        System.out.print("\n\n\n");
        double num1;
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        num1 = input1.nextDouble();

        double num2;
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter 2nd number : ");
        num2 = input2.nextDouble();

        double num3;
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter 3rd number : ");
        num3 = input3.nextDouble();

        double max , min ;

        if(num1 > num2 && num1 > num3) {
            max = num1;
            System.out.println("First number is largest : "+num1);
        } else if(num2 > num1 && num2 > num3) {
            max = num2;
            System.out.println("Second number is largest : "+num2);
        } else {
            max = num3;
            System.out.println("Third number is largest : "+num3);
        }
        
        if(num1 < num2 && num1 < num3) {
            min = num1;
            System.out.println("First number is smallest : "+num1);
        } else if(num2 < num1 && num2 < num3) {
            min = num2;
            System.out.println("Second number is smallest : "+num2);
        } else {
            min = num3;
            System.out.println("Third number is smallest : "+num3);
        }
        System.out.print("\n\n\n");
    }
}
