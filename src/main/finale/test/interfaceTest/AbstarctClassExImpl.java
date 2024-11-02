package main.finale.test.interfaceTest;

public class AbstarctClassExImpl extends AbstractClassEx{
    public AbstarctClassExImpl(int x, int y) {
        super(x, y);
    }

    public static void main(String[] args) {
        AbstarctClassExImpl obj = new AbstarctClassExImpl(1,2);
        System.out.println(obj.x + ": "+ obj.y + " :" + AbstractClassEx.z);
    }
}
