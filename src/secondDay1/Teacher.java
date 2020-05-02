package secondDay1;

public class Teacher extends Person {

    String name;
    int id;

    Teacher (){

    }

    Teacher (String name, int id){
        this.name = name;
        this.id = id;
    }

    void display ( ){
        System.out.println(name);
        System.out.println(id);
    }

}
