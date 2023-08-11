public class Circle extends Shape{
    Circle(){}
    Circle(double radius ){
       super(radius, radius);
    }
    public void setCircleRadius(double radius){
        setDim1(radius);
    }
    public double getCircleRadius(){
        return getDim1();
    }
    public void displayArea(){
        double area = 3.1416 * (getDim1() * getDim1());

        System.out.println("----------Circle-----------");
        System.out.println("Area : " +area);
    }
}
