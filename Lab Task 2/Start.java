public class Start {
    public static void main(String[] args) {
        System.out.println("\n\n\n");
        Shape s1 = new Rectangle(2, 3);
        Shape s2 = new Triangle(4, 4);
        Shape s3 = new Circle(5);

        s1.displayArea();
        s2.displayArea();
        s3.displayArea();
        System.out.println("\n\n\n");

        Circle c1 = new Circle();
        c1.setCircleRadius(5);
        c1.displayArea();
    }
}
