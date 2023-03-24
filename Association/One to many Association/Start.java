import java.lang.*;
public class Start{
	public static void main(String []Args){
        System.out.println("\n\n\n");
		Customer c1 = new Customer();
		BankAccount b1 = new BankAccount("22-48497-3","Md Nazmus",100000);
        BankAccount b2 = new BankAccount("22-48498-3","Sadat",1000000);
        BankAccount b3 = new BankAccount("22-48499-3","Numan",100000);
		c1.setPhoneNum(1724972425);
		c1.setBankAccount(b1);
        c1.showCoustomerinfo();
        c1.setPhoneNum(1645489811);
        c1.setBankAccount(b2);
        c1.showCoustomerinfo();
        c1.setPhoneNum(1943204272);
        c1.setBankAccount(b3);
		c1.showCoustomerinfo();
        System.out.println("\n\n\n");
	}
}