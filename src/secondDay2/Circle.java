package secondDay2;

public class Circle extends Geomatry{

    double radius;

    Circle (double radius){
        this.radius = radius;
    }

    @Override
    double area (){
        System.out.print("The area of a circle is : ");
        return (22/7)* radius *radius;

    }


}
