package secondDay3;

public class Barclays extends Bank {

    double interestRate  ;
    public Barclays(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    double interestRate ()
    {
        System.out.print(" Barclays interest rate is : ");
        return ( baseInterestRate + interestRate);
    }
}
