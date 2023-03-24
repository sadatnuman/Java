import java.lang.*;
public class Account{
	private int accNo;
	private double balance;
	public Account(){
		System.out.println("Empty Account");
	}
	public Account(int accNo, double balance){
		System.out.println("Parameterized Account");
		this.accNo=accNo;
		this.balance=balance;
	}
	public void setAccNo(int accNo){
		this.accNo = accNo;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public int getAccNo(){
		return accNo;
	}
	public double getBalance(){
		return balance;
	}
	public void withdraw(double amount){
		if(balance>amount&& (balance-amount)>100){
			balance = balance-amount;
			System.out.println("Transaction Successful!");
		}
		else{
			System.out.println("Insufficient balance!");
		}	
	}
	public void deposit(double amount){
		//make it appropriate
		balance = balance+amount;
	}
	public void transfer(Account acc, double amount){
		//make it appropriate
		this.balance = this.balance-amount;
		acc.balance = acc.balance+amount;
	}
	public void display(){
		System.out.println("Account Number: "+accNo);
		System.out.println("Account balance: "+balance);
	}
}