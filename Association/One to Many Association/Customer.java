import java.lang.*;
public class Customer{
	private String ahName;
	
	private BankAccount accounts[];
	
	public Customer( int arrSize){
		accounts =  new BankAccount[arrSize];
	}
	public void setCustomerNm(String ahName){
		this.ahName = ahName;
	}
	public void getCustomerNm(){
		System.out.println("Costomer Namne : "+ahName);
	}
	public void insertAcc(BankAccount acc){
		for(int i = 0;i<accounts.length;i++){
			if(accounts[i] == null){
				accounts[i] = acc;
				break;
			}
		}
	}
	public void deleteAcc(BankAccount acc){
		for(int i = 0;i<accounts.length;i++){
			if(accounts[i] == acc){
				accounts[i] = null;
			}
		}
	}
	
	public void showInfo(){
		for(int i =0;i<accounts.length; i++){
			if(accounts[i] != null){
				System.out.println("Costomer Namne : "+ahName);
				accounts[i].showAccInfo();
				System.out.println("------------------");
			}
			
		}
	}
	
}
	
	
	