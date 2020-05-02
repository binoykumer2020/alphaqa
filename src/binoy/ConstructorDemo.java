package binoy;

public class ConstructorDemo {

    String shoppingcentreName;
    String location;
    double distance;

    // creating a contructor---> Default Constructor
    ConstructorDemo (){
    }

    ConstructorDemo (String shoppingcentreName, String location){
        this.shoppingcentreName = shoppingcentreName;
        this.location = location;
    }

    ConstructorDemo ( String shoppingcentreName, String location, double distance){
        this.shoppingcentreName = shoppingcentreName;
        this. location = location;
        this. distance= distance;
    }

    void displayInformation ( ){
        System.out.println(" Name of the shopping centre is :" +shoppingcentreName);
        System.out.println(" Location is :"+ location  );
        System.out.println(" Distance is :" +distance);
    }


}
