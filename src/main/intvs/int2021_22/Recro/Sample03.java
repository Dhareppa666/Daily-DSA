package main.finale.REAL_TIME_COMP_QUES.Recro;

class Parent{
    void msg(){
        System.out.println("parent.");
    }
}

public class Sample03 extends Parent{
    void msg(){
        System.out.println("child.");
    }

    public static void main(String[] args) {
        Parent p = new Sample03();
        try {
            p.msg();
        }catch (Exception  e){}
    }
}
