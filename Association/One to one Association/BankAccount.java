import java.lang.*;
public class BankAccount{
	private String accNo;
	private String ahName;
	private double balance;
	
	public BankAccount(){}
	public BankAccount(String accNo, String ahName, double balance){
		this.accNo = accNo;
		this.ahName = ahName;
		this.balance = balance;
	}
	public String getAccountNo(){
		return accNo;
	}
	public String getAccountAhName(){
		return ahName;
	}
	public double getAccountBalance(){
		return balance;
	}
	public void showAccInfo(){
		System.out.println("Accout no: "+accNo);
		System.out.println("Accout Holder name: "+ahName);
		System.out.println("Balance: "+balance);
	}
}