package secondDay4;

public class Test  {
    public static void main(String[] args) {

        Bank bank = new Barclays(12.34);
        System.out.println(bank.interestRate());

        Bank bank1 = new HSBC(5.90);
        System.out.println(bank1.interestRate());




    }
}
