import java.util.Scanner;
public class Product8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch1, ch2;
        System.out.println("\n\n\n");
        System.out.print("Have you completed your Masters ? " + ":");
        ch1 = input.next().charAt(0);
        System.out.print("Are you fluent in English ? " + ":");
        ch2 = input.next().charAt(0);
        if ((ch1 == 'y' && ch2 == 'y') || (ch1 == 'Y' && ch2 == 'Y') || (ch1 == 'y' && ch2 == 'Y') || (ch1 == 'Y' && ch2 == 'y')) {
            System.out.println("You are the eligible candidate.");
        } else {
            System.out.println("You are not eligible to for the job interview.");
        }
        System.out.println("\n\n\n");
    }
} 
    

