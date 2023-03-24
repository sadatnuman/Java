import java.lang.*;
public class Start{
	public static void main(String []Args){
        System.out.println("\n\n\n");

		Customer c1 = new Customer(3);
		
		BankAccount b1 = new BankAccount("22-1",10000,"01645489811");
		BankAccount b2 = new BankAccount("22-2",100000,"01724972425");
		BankAccount b3 = new BankAccount("22-3",500000,"01943204272");
		
		c1.insertAcc(b1);
		c1.insertAcc(b2);
		c1.insertAcc(b3);
		c1.setCustomerNm("MD. Nazmus Sadat Numan");
		c1.showInfo();
		System.out.println("\t----------Deleting one---------");
		c1.deleteAcc(b2);
		c1.showInfo();
		
		System.out.println("\t----------Add New One---------");
		c1.setCustomerNm("MD. Nazmus Sadat Numan");
		BankAccount b4 = new BankAccount("22-4",100000,"01724972425");
		c1.insertAcc(b4);
		c1.showInfo();
	
        System.out.println("\n\n\n");
	}
}