package secondDay3;

abstract public class Bank {

     abstract  double interestRate(); // its an abstract method
    double baseInterestRate = 1.00;

    void display ()
    {
        System.out.println("I am a non abstract method");
    }

}
