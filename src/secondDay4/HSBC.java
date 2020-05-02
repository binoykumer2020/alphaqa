package secondDay4;

public  class HSBC implements Bank {

    double variableInterestRate;

    HSBC (double variableInterestRate)
    {
        this.variableInterestRate = variableInterestRate;
    }

    @Override
    public double interestRate() {
        System.out.print("HSBC interest rate : ");
        return baseInterestRate+ variableInterestRate;
    }
}
