public class Dog extends Animal{
    static {
        System.out.println(" Woof Woof!");
    }
    public Dog() {
        display("Dog");
    } 
    public void bark() {
        display("Bow wow!");
    }

}
