import java.util.Scanner;

public class Average8 {

    public static double calculateAvg(double a , double b ,double c){
        double avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        System.out.println("\n\n\n");
        Scanner A = new Scanner(System.in);
        System.out.println("Enter 3 number : ");
        double a = A.nextDouble();
        double b = A.nextDouble();
        double c = A.nextDouble();
        System.out.println("The Average of 3 number : "+calculateAvg(a,b,c));
        System.out.println("\n\n\n");
    }
}
