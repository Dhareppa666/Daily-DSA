package main.finale.JAVA.Generics;

public class MyGenericClass<T> {
    T obj;

    void add(T obj) {
        this.obj = obj;
    }

    T get() {
        return this.obj;
    }
}
