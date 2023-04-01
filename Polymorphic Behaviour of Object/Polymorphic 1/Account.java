import java.lang.*;
public class Account{
	private String accountNo;
	private double balance;
	
	public Account(){}
	public Account(String accountNo, double balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}
    public void setAccountNo(String accountNo){
        this.accountNo=accountNo;
    }
	public String getAccountNo(){
		return accountNo;
	}
	public void seBalance(double balance){
        this.balance=balance;
    }
	public double getBalance(){
		return balance;
	}
	public void showAccInfo(){
		System.out.println("Accout no: "+accountNo);
		System.out.println("Balance: "+balance);
	}
}