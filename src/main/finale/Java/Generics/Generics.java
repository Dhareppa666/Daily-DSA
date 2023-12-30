package main.finale.Java.Generics;

import main.finale.Java.Generics.MyGenericClass;

import java.util.List;

public class Generics {

    public static void main(String[] args) {
        Generics generics = new Generics();
        generics.genericsMethod("25");
        generics.genericsMethod("Hello");

        ////////////////
        //generics.getNumber("Hello");

        MyGenericClass<String> st = new MyGenericClass<>();
        st.add("Hello");
        System.out.println(st.get());

        MyGenericClass<Integer> it = new MyGenericClass<>();
        it.add(66);
        System.out.println(it.get());

    }

    // creae a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }

    public <T extends Number> String getNumber(T obj){
        return null;
    }

    //Wildcard with UPPER Bound.
    public static double sum(List<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }

    //Wildcard with unbounded.
    public static void printData(List<?> list){
        for(Object obj : list){
            System.out.print(obj + "::");
        }
    }

    //Wildcard with LOWER Bound.
    public static <T extends Integer> String addIntegers(List<? super Integer> list){
        list.add(new Integer(50));
        return "";
    }
}
