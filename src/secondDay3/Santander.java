package secondDay3;

public class Santander extends Bank {
    double interestRate = 12.1 ;
    @Override
    double interestRate ()
    {
        System.out.print(" Santander interest rate is : ");
        return ( baseInterestRate + interestRate);
    }
}
