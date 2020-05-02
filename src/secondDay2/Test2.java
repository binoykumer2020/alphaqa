package secondDay2;

public class Test2 {

    public static void main(String[] args) {

        // the concept of array come in the pictures

        Geomatry [] shape = new Geomatry[3];
        shape[0] =new Circle(12);
        shape[1] =new Rectangle(100,23);
        shape[2] =new Triangle(12,35);

        /*for (Geomatry x: shape) {
            System.out.println(x.area());
        }*/

        for (Geomatry jayHo:shape)
        {
            System.out.println(jayHo.area());
        }

    }
}
