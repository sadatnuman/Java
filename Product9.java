import java.util.Scanner;
public class Product9 {
    public static void main(String[] args) {
        System.out.print("\n\n\n");
        System.out.println("In this app, available languages are: \n0.English\n1.Bengali \n2.Hindi \n3.Urdu\n4.Japanese.\n");
        int choice;
        Scanner input= new Scanner(System.in);
        System.out.print("What is your choice: ");
        choice = input.nextInt();
        switch(choice){
            case 0:
                 System.out.println("English");
                 break;
            case 1:
                System.out.println("Bengali");
                break;
            case 2:
                System.out.println("Hindi");
                break;
            case 3:
                System.out.println("Urdu");
                break;
            case 4:
                System.out.println("Japanese");
                break;
            default:
                System.out.println("English.");
                break;
        }
        System.out.print("\n\n\n");
    }    
}

