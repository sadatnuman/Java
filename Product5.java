import java.util.Scanner;
public class Product5 {
	public static void main(String[] args) {
		System.out.print("\n\n\n");
        Scanner input = new Scanner(System.in);
		int voterAge;
		System.out.print("Enter your age: ");
		voterAge = input.nextInt();
		if (voterAge >= 18) {
			System.out.println("Valid Voter");
		} 
        else {
			System.out.println("Invalid Voter");
		}
        System.out.print("\n\n\n");
	}
}
