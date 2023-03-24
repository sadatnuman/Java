import java.lang.*;
public class BankAccount{
	private String accNo;
	private double balance;
	private String phoneNum;
	
	public BankAccount(){}
	public BankAccount(String accNo, double balance,String phoneNum){
		this.accNo = accNo;
		this.balance = balance;
		this.phoneNum = phoneNum;
	}
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}
	public String getPhoneNum(){
		return phoneNum;
	}
	public String getAccountNo(){
		return accNo;
	}
	public double getAccountBalance(){
		return balance;
	}
	public void showAccInfo(){
		System.out.println("Accout no: "+accNo);
		System.out.println("Balance: "+balance);
		System.out.println("Phone Number: "+phoneNum);
	}
}