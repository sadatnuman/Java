public class Start {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(11, 0, 10000, 1000);
        System.out.println("\n\n\n");
        s1.deposit();
        s1.widthdraw();
        s1.calculateInterest();
        s1.showInfo();
        System.out.println("\n\n\n");
    }
}
