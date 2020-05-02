package secondDay1;

public class Student extends Person  {

    @Override
    void add (int a, int b ){
        int result = a+b;
        System.out.println(result);
        System.out.println("I am from Student class-->a sub class method");
    }

    @Override
    void add ( double a, double b){
        double result = a+b;
        System.out.println(result);
        System.out.println(" I am from student class--> sub class method");

    }
}
