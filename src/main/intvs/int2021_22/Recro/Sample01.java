package main.intvs.int2021_22.Recro;

public class Sample01 {
    public static void main(String[] args) {
        int val =10;
        if ((val>10? val++: --val)<10){
            System.out.println("MAC");
        }
        if (val<10){
            System.out.println("PC");
        }
    }
}
