package secondDay2;

public class Rectangle extends Geomatry {

    double height, width;

    Rectangle (double height, double width){
        this.height = height;
        this.width  = width;

    }

    @Override
    double area (){
        System.out.print("The area of a circle is : ");
        return  height *width ;

    }
}
