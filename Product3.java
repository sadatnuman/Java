/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
* step 5: print the variables*/
import java.util.Scanner;
public class Product3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int id;
		String title;
		double price;
		String description;
		String catgory;
		System.out.print("Enter ID : ");
		id = input.nextInt();
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter title : ");
		title = input1.nextLine();
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter price : ");
		price = input2.nextDouble();
		
		System.out.print("Enter description : ");
		description = input1.nextLine();
		
		System.out.print("Enter catgory : ");
		catgory = input1.nextLine();
		
		
		System.out.println("\nThe product"  );
		System.out.println("----------------"  );
		System.out.println("ID : "+id  );
		System.out.println("Title : "+title  );
		System.out.println("price : "+price  );
		System.out.println("description : "+description  );
		System.out.println("catgory : "+catgory  );
	}
}
