public class Start2 {
    public static void main(String[] args) {
        System.out.println("\n\n\n");
        Car c1 = new Car("Bmw", "214-3", 10000);
        c1.drive();
        c1.showDetails();
        Bike b1= new Bike("R15", "v3", 150);
        b1.drive();
        b1.showDetails();
        System.out.println("\n\n\n");
    }
}
