package collection;
import java.util.ArrayList;
import java.util.HashSet;

public class Hashing {

    public static void main(String[] args) {

        HashSet<String> stu1 = new HashSet<>();
        stu1.add("Binoy");
        stu1.add("M");
        stu1.add("1234567");
        stu1.add("Java API");
        stu1.add("Binoy");


        System.out.println(stu1);
        // As we can't use get method because of indexing so can't use get methid here
        // to get a specific value, we can convert this set to List then we can use get method


        //ArrayList<String>  list = new ArrayList<>(stu1);
        //System.out.println(list.get(0));

        // LinkedHashSet is an insertation order
        // there are 10s number of window needs to open then this concept really helpful

    }

}
