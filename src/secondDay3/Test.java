package secondDay3;

public class Test {
    public static void main(String[] args) {

        Barclays barclays = new Barclays(5.6);
        System.out.println(barclays.interestRate() + " %");

        Bank santander = new Santander();
        System.out.println(santander.interestRate() + " %");

        Bank hsbc = new HSBC();
        System.out.println(hsbc.interestRate() + " %");
    }
}
