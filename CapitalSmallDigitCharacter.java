import java.util.Scanner;

public class CapitalSmallDigitCharacter {
    public static void main(String[] args){
        System.out.print("\n\n\n");
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter : ");
        ch = input.next().charAt(0);
        if(ch >= 65 && ch <= 90){
            System.out.println("Capital letter.");
        }
        else if(ch >=97 && ch <=122){
            System.out.println("Small letter.");
        }
        else if(ch >=48 && ch <= 57){
            System.out.println(" The Character is a Digit");
        }
        else if((ch >=0 && ch <= 47)||(ch >= 58 && ch <=64)||(ch >= 91 && ch <=96)||(ch >= 123 && ch <= 127)){
            System.out.println("The Character is Special Character");
        }
        System.out.print("\n\n\n");
    }
}
