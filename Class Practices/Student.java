public class Student{
    private String name;
    private int roll_no;

    public Student(String name , int roll_no){
        this.name = name;
        this.roll_no= roll_no;
    }
    public void ShowInfo(){
         System.out.println("Name : "+name);
         System.out.println("Roll : "+roll_no);
    }
    public static void main(String[] args) {
        Student S1 = new Student("John",2);
        S1.ShowInfo();
    }
}