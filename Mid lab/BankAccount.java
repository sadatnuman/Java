

public class BankAccount{
    private int account_no;
    private double balance;
    private double widthdraw_balance;
    private double deposit_balance;

    public BankAccount(){};
    public BankAccount(int account_no ,double balance,double deposit_balance,double widthdraw_balance){
        this.account_no = account_no;
        this.balance = balance;
        this.deposit_balance = deposit_balance;
        this.widthdraw_balance = widthdraw_balance;
    }
    public double deposit(){
        balance = 0.0;
        return balance+deposit_balance;
    }
    public double widthdraw(){
        balance = deposit();
        return balance - widthdraw_balance;
    }
    public double check_balance(){
        
        return widthdraw();
    }
    public void showInfo(){
        System.out.println("Account No : "+account_no);
        System.out.println("Balance : "+balance);
        System.out.println("After Deposit balance : "+deposit());
        System.out.println("After Widthdraw balance: "+widthdraw());
        System.out.println("Check balance: "+check_balance());
    }
}