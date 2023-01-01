import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        System.out.print("\n\n\n");
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter : ");
        ch = input.next().charAt(0);
        if(ch == 'a'){
            System.out.println("Vowel.");
        }
        else if(ch == 'e'){
            System.out.println("Vowel.");
        }
        else if(ch == 'i'){
            System.out.println("Vowel.");
        }
        else if(ch == 'o'){
            System.out.println("Vowel.");
        }
        else if(ch == 'u'){
            System.out.println("Vowel.");
        }
        else if(ch == 'A'){
            System.out.println("Vowel.");
        }
        else if(ch == 'E'){
            System.out.println("Vowel.");
        }
        else if(ch == 'I'){
            System.out.println("Vowel.");
        }
        else if(ch == 'O'){
            System.out.println("Vowel.");
        }
        else if(ch == 'U'){
            System.out.println("Vowel.");
        }
        else {
            System.out.println("Consonant.");
        }
        System.out.print("\n\n\n");
    }
}
