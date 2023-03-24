import java.lang.*;
public class Start{
	public static void main(String []Args){
        System.out.println("\n\n\n");
		Customer c1 = new Customer();
		c1.setPhoneNum(1724972425);
		BankAccount b1 = new BankAccount("22-48497-3","Sadat Numan",100000000);
		c1.setBankAccount(b1);
		c1.showCoustomerinfo();
        System.out.println("\n\n\n");
	}
}