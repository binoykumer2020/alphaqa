package secondDay4;

public class Barclays implements Bank {


    double variableInterestRate;

           Barclays (double variableInterestRate)
           {
            this.variableInterestRate = variableInterestRate;
            }

        @Override
        public double interestRate() {
            System.out.print("Barclays interest rate : ");
            return baseInterestRate+ variableInterestRate;
        }
    }

