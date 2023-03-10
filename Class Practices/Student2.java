public class Student2 {
    private String Name;
    private int roll;
    private int phone_number;
    private String address;
    
    public Student2(String Name , int roll ,int phone_number, String address ){
        this.Name = Name;
        this.roll = roll;
        this.phone_number = phone_number;
        this.address = address;
    }
    public void ShowInfo(){
        System.out.println("Name : "+Name);
        System.out.println("Roll : "+roll);
        System.out.println("Phone : "+phone_number);
        System.out.println("Address : "+address);
    }
    public static void main(String[] args) {
        Student2 S1 = new Student2("John",2,2345787,"Rajbari");
        S1.ShowInfo();
        Student2 S2 = new Student2("Sam",3,54546576,"Rajbari");
        S2.ShowInfo();
    }
}