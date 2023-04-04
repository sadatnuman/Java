public class Rectangle extends Shape{
   
    Rectangle(){}
    Rectangle(double length,double width){
        super(length, width);
    }
    public void setRectangleLenght(double length){
         setDim1(length);
    }
    public void setRectangleWidth(double width){
        setDim2(width);
    }
    public double getRectangleLenght(){
        return getDim1();
    }
    public double getRectangleWidth(){
        return getDim2();
    }
    public void  displayArea(){
        double area = getDim1() * getDim2();

        System.out.println("----------Rectangle-----------");
        System.out.println("Area : " +area);
    }
}
