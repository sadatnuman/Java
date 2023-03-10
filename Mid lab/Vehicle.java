public class Vehicle {
    private String model;
    private String engine_number;
    private double engine_power;

    public Vehicle(){}
    public Vehicle(String model,String engine_number,double engine_power){
        this.model=model;
        this.engine_number=engine_number;
        this.engine_power=engine_power;
    }
    public boolean startengine(){
        return true;
    }
    public void showDetails(){
        System.out.println("Model :"+model);
        System.out.println("Engine number :"+engine_number);
        System.out.println("Engine power :"+engine_power);
    }
}
