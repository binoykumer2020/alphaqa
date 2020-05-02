package secondDay3;

public class Test1 {
    public static void main(String[] args) {

        Bank [] bank = new Bank[3];
        bank[0] = new Barclays(2.7);
        bank[1] = new HSBC();
        bank[2] = new Santander();

        for (Bank i:bank)
        {
            System.out.println(i.interestRate());
        }

    }
}
