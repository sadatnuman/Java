public class Triangle extends Shape{
    Triangle(){}
    Triangle(double base , double height){
        super(base, height);
    }
    public void setTriangleBase(double base){
        setDim1(base);
    }
    public void getTriangleHeight(double height){
        setDim2(height);
    }
    public double getTriangleBase(){
        return getDim1();
    }
    public double getTriangleHeight(){
        return getDim2();
    }
    public void displayArea(){
        double area = 0.5 * getDim1() * getDim2();

        System.out.println("----------Triangle-----------");
        System.out.println("Area : " +area);
    }
}
