public class Rectangle5 {
    private double  Length;
    private double  Breadth;

    public Rectangle5(double Length , double Breadth){
        this.Length = Length;
        this.Breadth = Breadth;
    }
    public double Area(){
        double area = Length * Breadth;
        return area;
    }
    public void Display(){
        System.out.println("Length : "+ Length);
        System.out.println("Breadth : "+Breadth);
        System.out.println("Area : "+Area());
    }
    public static void main(String[] args) {
        Rectangle5 R1 = new Rectangle5(4, 5);
        R1.Area();
        R1.Display();
        System.out.println("\n");
        Rectangle5 R2 = new Rectangle5(5, 8);
        R2.Area();
        R2.Display();
    }
}
