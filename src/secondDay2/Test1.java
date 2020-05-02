package secondDay2;

public class Test1 {

    public static void main(String[] args) {

        // now we are going to learn super class used to use refernece

        Geomatry g1 = new Circle(4);
        Geomatry g2 = new Rectangle(12, 1);
        Geomatry g3 = new Triangle(10, 5);

        System.out.println(g1.area());
        System.out.println(g2.area());
        System.out.println(g3.area());


    }



}
