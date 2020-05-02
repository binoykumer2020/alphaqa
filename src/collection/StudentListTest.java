package collection;

import java.util.LinkedList;

public class StudentListTest {

    public static void main(String[] args) {


        StudentList ob1 = new StudentList(1001, "Binoy", "Java API");
        StudentList ob2 = new StudentList(1002, "Tejas", "Selenium WebDriver");
        StudentList ob3 = new StudentList(1003, "Ishaan", "Backend Engineer");
        StudentList ob4 = new StudentList(1002, "Tejas", "Selenium WebDriver");

        LinkedList<StudentList> list = new LinkedList<StudentList>();

        list.add(ob1);
        list.add(ob2);
        list.add(ob3);
        list.add(ob4);

        for (StudentList student:list)
        {
            System.out.println(student.id + " " +student.names + " " + student.courseName);

        }




    }
}
