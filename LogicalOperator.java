import java.util.Scanner;
public class LogicalOperator {
    /*
    && Logical AND
      || Logical OR 
      !  Logical Not
      */
    public static void main(String[] args){
        System.out.print("\n\\n\n");
        double year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        year = input.nextDouble();
        if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Leap year.");
        }
        else{
            System.out.println("Not a leap year.");
        }
        System.out.print("\n\\n\n");
    }
}

