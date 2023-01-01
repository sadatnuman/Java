import java.util.Scanner;
public class Product4 {
	public static void main(String[] args) {
        System.out.print("\n\n\n");
		Scanner input = new Scanner(System.in);
		double phonePrice = 1800;
		double numberOfInstallment, installmentPerMonth;
		System.out.print("Enter Number of Installment: ");
		numberOfInstallment = input.nextDouble();
		installmentPerMonth = phonePrice / numberOfInstallment;
		System.out.println("Monthly Installment: " + installmentPerMonth + " euro");
        System.out.print("\n\n\n");
	}
}

