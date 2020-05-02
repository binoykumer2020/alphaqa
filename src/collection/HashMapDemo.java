package collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String,String> ob1 = new HashMap<String ,String>();
        ob1.put("firstName", "Binoy");
        ob1.put("1002", "Tejas");
        ob1.put("1003", "Rakhi");
        ob1.put("1004", "Jay");
        ob1.put("1005", "Pranav");
        ob1.put("1006", "Samir");
        ob1.put("1007", "MD");
        ob1.put("1007", "MD");

        System.out.println(ob1);
       // System.out.println(ob1.get("1001"));
       // System.out.println(ob1.size());

       /* for (Map.Entry<String, String> student:ob1.entrySet()) // entry set
        {
           // System.out.println(student);

        }*/
    }
}
