public class SavingsAccount extends BankAccount{
    public SavingsAccount (int account_no ,double balance,double deposit_balance,double widthdraw_balance){
        super(account_no, balance, deposit_balance, widthdraw_balance);
    }
    public double calculateInterest(){
        super.check_balance();
        double C = check_balance()* 0.2;
        return C;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Interest balance: "+calculateInterest());
    }
}
