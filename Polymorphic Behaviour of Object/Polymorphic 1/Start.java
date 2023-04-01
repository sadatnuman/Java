import java.lang.*;
public class Start {
    public static void main(String[] args) {
        System.out.println("\n\n\n");
        Coutomer c1 = new Coutomer(112233,"Sadat Numan", 3,3);

        Account a1 = new SavingsAccount("11223", 50000, 10);
        Account a2 = new FixedAccount("1122",60000,1);


        c1.addSavingsAccount((SavingsAccount) a1);
        c1.addFixedAccount((FixedAccount) a2);

        c1.showAllFixedAccount();

        System.out.print("\n");

        c1.showAllSavingsAccount();

        System.out.println("------------------------------");

        c1.removeFixedAccount((FixedAccount) a2);
        c1.removeSavingsAccount((SavingsAccount) a1);

        c1.showAllFixedAccount();

        System.out.print("\n");

        c1.showAllSavingsAccount();

        System.out.println("------------------------------");

        Account a3 = new SavingsAccount("112234", 10000, 15);

        c1.addSavingsAccount((SavingsAccount) a3);
        c1.showAllSavingsAccount();
        
        System.out.println("\n\n\n");
    }
}
