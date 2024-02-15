package main.finale.Java.examples;

import java.util.HashMap;

class Base{
    public void display(){
        System.out.println("base");
    }
}
class Derived extends Base{
    public void display(){
        System.out.println("Derived");
    }
}

class Employee{
    int id;
    String fname;
    String lname;

    public Employee(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }
}

public class Solution {
    private static int x = 5;

    public static void main(String[] args) {
        Base b1 = new Base();
        b1.display();


        Derived d1 = new Derived();
        d1.display();

        Base c1 = new Derived();
        c1.display();

        //Derived ag1 = new Base();
        //ag1.display();

        System.out.println(x++);

        //////////////// 02
        HashMap<Employee, Integer> map = new HashMap<>();
        Employee e = new Employee(1, "rajat", "goel");
        map.put(e, 99);

        //map.get(e).id = 99; //mujhe gantaaaaaaaa mila isse

        System.out.println(map.get(e));


        //////////////// 03
        System.out.println("<<<<<>>>>>");
        String a = new String("xyz");
        String b = new String("xyz");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        String c = "xyz";

        System.out.println(a == c);
        System.out.println(a.equals(c));

    }
}


