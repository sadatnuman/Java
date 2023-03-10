public class Student1{
    private String name;
    private int roll_no;

    public Student1(String name , int roll_no){
        this.name = name;
        this.roll_no= roll_no;
    }
    public void ShowInfo(){
         System.out.println("Name : "+name);
         System.out.println("Roll : "+roll_no);
    }
    public static void main(String[] args) {
        Student1 S1 = new Student1("John",2);
        S1.ShowInfo();
    }
}