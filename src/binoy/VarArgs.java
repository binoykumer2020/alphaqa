package binoy;

public class VarArgs {

    int a = 10;
     int b = 12;

     void add (){
         int result = a+b;
         System.out.println(result);
         System.out.println(a+b);

     }

     void addition ( int ... numbers){

            int sum = 0;
         for (int val:numbers) {
             sum = sum + val;
         }
         System.out.println("Adiition of these numbers :" +sum);
     }
}
