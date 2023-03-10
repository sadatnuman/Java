public class Car extends Vehicle{
    Car(String model,String engine_number,double engine_power){
        super(model, engine_number, engine_power);
    }
    public void drive(){
        System.out.println("Car Driving");
    }
    public void showDetails(){
        super.showDetails();
    }

}
