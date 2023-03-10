public class Oder {
    private int oderid;
    private String deliveryLocation;
    private double discountpercentage;
    private double price;

    public Oder(){}
    public Oder(int oderid,String deliveryLocation,double discountpercentage, double price){
        this.oderid=oderid;
        this.deliveryLocation=deliveryLocation;
        this.discountpercentage=discountpercentage;
        this.price=price;
    }
    public void setdeliveryLocation(String deliveryLocation){
        this.deliveryLocation=deliveryLocation;
    }
    public void setdiscountpercentage(double discountpercentage){
        this.discountpercentage=discountpercentage;
    }
    public void getdeliveryLocation(){
        System.out.println("Delivery Location : "+deliveryLocation);
    }
    public void getdiscountpercentage(){
        System.out.println("Discount Percentage: "+discountpercentage);
    }
    public double Price(){
        double p = (discountpercentage/100)*price;

        double P = (price - p)+ 50;
        return P;
    }
    public void showoderDetails(){
        System.out.println("Oder Id: "+oderid);
        System.out.println("Delivery Location : "+deliveryLocation);
        System.out.println("Discount Percentage: "+discountpercentage +"%");
        System.out.println("Price : "+Price());
    }
    public static void main(String[] args) {
        System.out.println("\n\n\n");
        Oder a = new Oder(11, "Aiub", 10, 100);
        a.Price();
        a.showoderDetails();
        System.out.println("\n\n\n");
    }
}
