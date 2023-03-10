import java.util.Scanner;

public class Area6 {
    private double  Length;
    private double  Breadth;

    public void setDim(double Length , double Breadth){
        this.Length = Length;
        this.Breadth = Breadth;
    }
    public double getArea(){
        double area = Length * Breadth;
        return area;
    }
    public void Display(){
        System.out.println("Length : "+ Length);
        System.out.println("Breadth : "+Breadth);
        System.out.println("Area : "+getArea());
    }
    public static void main(String[] args) {
        System.out.println("\n\n\n");
        Area6 a1 = new Area6();
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle : ");
        double Length = a.nextDouble();
        System.out.print("Enter the Breadth of Rectangle : ");
        double Breadth = a.nextDouble();
        a1.setDim(Length, Breadth);
        a1.getArea();
        a1.Display();
        System.out.println("\n\n\n");
    }
}
