package secondDay1;

public class Person {

    // Here we are going to learn about methods overloading and overrididng
    // these two are the best examples of compile and runtime polymorphism
    // we also cover an encapsulation
    // Inheritance concept as well



    void add (int a, int b ){
        int result = a+b;
        System.out.println(result);
        System.out.println(" I am from person class--> super class method");

    }

    void add ( double a, double b){
        double result = a+b;
        System.out.println(result);
        System.out.println(" I am from person class--> super class method");

    }

}
