package secondDay2;

public class Triangle extends Geomatry {

    double base, height;

    Triangle (double base, double height){
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        System.out.print("The area of a triangle is :");
        return (0.5 * base * height);
    }
}
