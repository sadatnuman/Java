import java.lang.*;
public class FixedAccount extends Account{
    private int tenureYear;
    FixedAccount(){}
    FixedAccount(String accountNo, double balance,int tenureYear){
        super(accountNo, balance);
        this.tenureYear=tenureYear;
    }
    public void setTenureYear(int tenureYear){
        this.tenureYear=tenureYear;
    }
    public int getTenureYear(){
        return tenureYear;
    }
}
