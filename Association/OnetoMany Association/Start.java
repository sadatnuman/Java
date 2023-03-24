import java.lang.*;

public class Start
{
	public static void main(String[] args){
       System.out.println("\n\n\n");

		Account a1 = new Account(123, 1500);
		Account a2 = new Account(456, 200);
		
		Customer c2 = new Customer("C-02", 2);
		c2.addAccount(a1);
		c2.addAccount(a2);
	
		c2.displayAccount();
		
		c2.searchAccount(a2);
		c2.removeAccount(a2);
		c2.searchAccount(a2);
		
		c2.displayAccount();
		
		c2.performDeposit(a1, 300);
		
		c2.displayAccount();
		
		/*Customer c1 = new Customer("C-01", a1);
		c1.showDetails();
		
		c1.performDeposit(400);
		c1.performWithdraw(100);
		c1.performTransfer(a2, 400);
		
		c1.showDetails();*/
        System.out.println("\n\n\n");
	}
}