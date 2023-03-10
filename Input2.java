import java.util.Scanner;
public class Input2 {
    public static void main(String[] args) {
        System.out.print("\n\n\n");
        
        Scanner a = new Scanner(System.in);

       
        System.out.println("Enter your First Name : ");
        //String name = a.nextLine();
        System.out.println("Enter your last Name : ");
        //String name2 = a.nextLine();
        //System.out.print("Name : "+name);
        //System.out.println(" "+name2);

        System.out.println("Enter your Student ID : ");
        //String ID = a.nextLine();
        //System.out.println("ID: "+ID);

        System.out.println("Enter your cgpa : ");
        float cgpa = a.nextFloat();
        System.out.println("CGPA: "+cgpa);

        System.out.println("Enter your Gender : ");
        char gen = a.next().charAt(0);
        System.out.println("Gender: "+gen);

        System.out.print("\n\n\n");
    }
}
