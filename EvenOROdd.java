import java . util.Scanner;
public class EvenOROdd {
    public static void main(String[] args){
        System.out.println("\n\n\n");
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("Number is even.");
        }
        else{
            System.out.println("Number is odd.");
        }
    System.out.println("\n\n\n");
    }
}
