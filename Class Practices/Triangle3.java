import java.lang.Math;
public class Triangle3 {
    private double side1;
    private double side2;
    private double side3;

    public void T(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double perimeter() {
        double Perimeter = side1 + side2 + side3;
        return Perimeter;
    }
    public double area() {
        double Semi_Perimeter = (side1 + side2 + side3)/2;
        double Area = Math.sqrt((Semi_Perimeter*(Semi_Perimeter - side1)*(Semi_Perimeter - side2)*(Semi_Perimeter - side3)));
        return Area;
    }
    public void Display(){
        System.out.println("\t Triangle.");
        System.out.println("Perimeter of Triangle : "+ perimeter());
        System.out.println("Area of Triangle : "+ area());
    }
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3();
        t1.T(3, 4, 5);
        t1.Display();
    }
}
