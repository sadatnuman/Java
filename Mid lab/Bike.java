public class Bike extends Vehicle{
    public Bike(String model,String engine_number,double engine_power){
        super(model, engine_number, engine_power);
    }
    public void drive(){
        System.out.println("Bike Driving");
    }
    public void showDetails(){
        super.showDetails();
    }
}
