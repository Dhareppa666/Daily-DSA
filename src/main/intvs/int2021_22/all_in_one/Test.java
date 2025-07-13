package main.intvs.int2021_22.all_in_one;

public class Test {

    public static void main(String[] args) {
        Employe emp1 = new Employe();

        emp1.setId(1);
        emp1.setName("John");

        Employe emp2 = new Employe();

        emp2.setId(1);
        emp2.setName("John");

        System.out.println("Shallow Comparing: " + (emp1 == emp2));
        System.out.println("Deep Comparing: " + emp1.equals(emp2));
    }
}
