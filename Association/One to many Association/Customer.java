import java.lang.*;
public class Customer{
	private int phoneNum;
	private BankAccount acc;
	
	public void setPhoneNum(int phoneNum){
		this.phoneNum = phoneNum;
	}
	public int getPhoneNum(){
		return phoneNum;
	}
	
	public void setBankAccount(BankAccount acc){
		this.acc = acc;
	}
	
	public void showCoustomerinfo(){
		acc.showAccInfo();
		System.out.println("Phone Number: "+phoneNum);
        System.out.println("\n--------------------------------\n");
	}
}