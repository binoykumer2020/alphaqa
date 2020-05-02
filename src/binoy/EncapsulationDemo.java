package binoy;

public class EncapsulationDemo {

    String fruitName;
    String sendingLocation;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    EncapsulationDemo ( String fruitName, String sendingLocation){
         this. fruitName = fruitName;
         this. sendingLocation = sendingLocation;
    }

    void displayInformation ( ){
        System.out.println(" Fruit name :" +fruitName);
        System.out.println( "Sending Location : "+ sendingLocation);
        System.out.println( "Price of the fruit :  "+getPrice());
    }



}
