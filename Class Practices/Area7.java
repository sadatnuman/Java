import java.util.Scanner;

public class Area7 {
    private double  Length;
    private double  Breadth;

    public Area7(double Length , double Breadth){
        this.Length = Length;
        this.Breadth = Breadth;
    }
    public double returnArea(){
        double area = Length * Breadth;
        return area;
    }
    public void Display(){
        System.out.println("Length : "+ Length);
        System.out.println("Breadth : "+Breadth);
        System.out.println("Area : "+returnArea());
    }
    public static void main(String[] args) {
        System.out.println("\n\n\n");
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle : ");
        double Length = a.nextDouble();
        System.out.print("Enter the Breadth of Rectangle : ");
        double Breadth = a.nextDouble();
        Area7 R1 = new Area7(Length, Breadth);
        R1.returnArea();
        R1.Display();
        System.out.println("\n\n\n");
    }
}
