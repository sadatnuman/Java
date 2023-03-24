public class Customer{
	private String cID;
	private Account acc[];
	
	public Customer(){
		System.out.println("Empty Customer");
	}
	public Customer(String cID, int no){
		System.out.println("Parameterized Customer");
		this.cID = cID;
		acc = new Account[no];
	}
	public void addAccount(Account a){
		int check = 1;
		for(int i = 0; i<acc.length; i++){
			if(acc[i]==null){
				acc[i] = a;
				check = 0;
				break;
			}
		}
		if(check ==0){
			System.out.println("Account added successfully!");
		}
		else{
			System.out.println("Account not added!");
		}
	}
	public void removeAccount(Account a){
		int check = 1;
		for(int i = 0; i<acc.length; i++){
			if(acc[i]==a){
				acc[i] = null;
				check = 0;
			}
		}
		if(check ==0){
			System.out.println("Account removed successfully!");
		}
		else{
			System.out.println("Account not found and not removed!");
		}
	}
	public void searchAccount(Account a){
		int check = 1;
		for(int i = 0; i<acc.length; i++){
			if(acc[i]==a){
				check = 0;
			}
		}
		if(check ==0){
			System.out.println("Account found!");
		}
		else{
			System.out.println("Account not found!");
		}
	}
	public void displayAccount(){
		
		for(int i = 0; i<acc.length; i++){
			if(acc[i]!=null){
				acc[i].display();
			}
		}
		
	}
	/*public void setCid(String cID){
		this.cID = cID;
	}
	public void setAcc(Account acc){
		this.acc = acc;
	}
	public String getCid(){
		return cID;
	}
	public Account getAcc(){
		return acc;
	}*/
	public void performDeposit(Account a, double amount){
		for(int i = 0; i<acc.length; i++){
			if(acc[i] == a){
				acc[i].deposit(amount);
			}
		}
	}
	/*public void performWithdraw(double amount){
		acc.withdraw(amount);
	}
	public void performTransfer(Account a, double amount){
		acc.transfer(a, amount);
	}*/
	public void showDetails(){
		System.out.println("Customer ID: "+cID);
		displayAccount();
	}
	
}