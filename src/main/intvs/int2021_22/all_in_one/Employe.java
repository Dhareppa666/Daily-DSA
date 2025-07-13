package main.intvs.int2021_22.all_in_one;

public class Employe {

    private String name;

    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean equals(Object o){
        //STEP1: 1.any one obj is null or not. 2.check the class type.
        if (o==null || getClass() !=o.getClass())
            return false;
        //STEP2: 3. Memory address is same.[If they are pointing to same location]
        if (o==this)
            return true;
        Employe e = (Employe) o;
        return (this.getId() == e.getId());
    }

    public int hashCode(){
        return id;
    }
}
