import java . util . Scanner;
public class AreaPerimeter {
    public static void main(String[] args){
        System.out.print("\n\n\n");
       
       
        System.out.println("\tSquare");
        double length ;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the length of side of a Square : ");
        length = input.nextDouble();
        double Square_Area = length * length;
        System.out.println("Area of Square : "+Square_Area);
        double Square_Perimeter = 4 * length;
        System.out.println("Perimeter of Square : "+Square_Perimeter);
        System.out.print("\n");


        System.out.println("\tRectangle");
        double length1 , width ;
        Scanner input1 = new Scanner (System.in);
        System.out.print("Enter the length of Rectangle : ");
        length1 = input.nextDouble();
        Scanner input2 = new Scanner (System.in);
        System.out.print("Enter the width of Rectangle : ");
        width = input.nextDouble();
        double Rectangle_Area = length1 * width;
        System.out.println("Area of Rectangle : "+Rectangle_Area);
        double Rectangle_Perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle : "+Rectangle_Perimeter);
        System.out.print("\n");


        System.out.println("\tTriangle");
        double  sides , base ,height ;
        Scanner input3 = new Scanner (System.in);
        System.out.print("Enter the height of Triangle : ");
        height = input.nextDouble();
        Scanner input4 = new Scanner (System.in);
        System.out.print("Enter the base of Triangle : ");
        base = input.nextDouble();
        Scanner input5 = new Scanner (System.in);
        System.out.print("Enter the sides of Triangle : ");
        sides = input.nextDouble();
        double Triangle_Area = 0.5 * height * base;
        System.out.println("Area of Triangle : "+Triangle_Area);
        double Triangle_Perimeter = height + base + sides;
        System.out.println("Perimeter of Triangle : "+Triangle_Perimeter);
        System.out.print("\n");


        System.out.println("\tCircle");
        double radius ;
        Scanner input6 = new Scanner (System.in);
        System.out.print("Enter the radius of Circle : ");
        radius = input.nextDouble();
        double Circle_Area = 3.1416 * (radius * radius);
        System.out.println("Area of Circle : "+Circle_Area);
        double Circle_Perimeter = 2 * 3.1416 * radius;
        System.out.println("Perimeter of Circle : "+Circle_Perimeter);
        
        
        System.out.print("\n\n\n");
    }
}
