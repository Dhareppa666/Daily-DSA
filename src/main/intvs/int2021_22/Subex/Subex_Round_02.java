package main.intvs.int2021_22.Subex;

final class Employee_Immutable {
    private final String name;
    private final Integer id;
    public Employee_Immutable(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public Integer getId() {
        return id;
    }
}

class Employee_Mutable {
    private String name;
    private Integer id;

    public Employee_Mutable(){
    }

    public Employee_Mutable(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

public class Subex_Round_02 {

    public static void main(String[] args) {
        //CASE:1  -> Immutable
        Employee_Immutable emp1 = new Employee_Immutable("Arun", 1);

        //CASE:2  -> Mutable
        final Employee_Immutable emp2 = new Employee_Immutable("Arun", 1);

        System.out.println(emp2.getId());
        System.out.println(emp2.getName());

        Employee_Mutable emp3 = new Employee_Mutable();

        System.out.println(emp3.getId());
        System.out.println(emp3.getName());


    }
}
