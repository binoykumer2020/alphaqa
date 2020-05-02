package secondDay3;

public class HSBC extends Bank {

    double interestRate = 5.1 ;
    @Override
    double interestRate ()
    {
        System.out.print(" HSBC interest rate is : ");
        return ( baseInterestRate + interestRate);
    }
}
