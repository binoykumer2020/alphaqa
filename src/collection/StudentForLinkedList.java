package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentForLinkedList {
    // collection is a dynamic data structure
    // is an architectural framework that used for manipulation and data storing ( group of objects)
    // we can do insertion, searching, sorting, deletion etc
    // maintain insertion order
    // taking duplicates
    public static void main(String[] args) {

        LinkedList stu1 = new LinkedList();
        stu1.add("Binoy");
        stu1.add('M');
        stu1.add(1234567);
        stu1.add("Java Selenium");
        stu1.add("Binoy");
        stu1.add("Tejas");
        stu1.add("Samir");
        stu1.add("Jay");

        System.out.println(stu1);

        /*System.out.println(stu1.size());
        System.out.println(stu1);
        System.out.println(stu1.get(0));
        System.out.println(stu1.size());

         */
        //System.out.println(stu1.isEmpty());
        //System.out.println(stu1.contains("Binoy"));

        for (Object obj: stu1)
        {
           // System.out.println(obj);
        }


        
    }

}
