package main.finale.LeDurga.Inheritance;

public class Childu extends Abstr_Ex{
    @Override
    public void m1() {
        System.out.println("Childu");
    }

    public static void main(String[] args) {
        Childu c = new Childu();
        int x = Abstr_Ex.y;
    }
}
