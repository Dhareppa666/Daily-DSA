package main.finale.test;

public class curse {
    String course;
    String fee;

    curse(String course, String fee){
        this.course = course;
        this.fee = fee;
    }

    public static void main(String[] args) {
        curse[] c = new curse[3];
        c[0] = new curse("Java", "100");
        c[2] = new curse("PY", "1");
        for(curse c1 : c){
            System.out.println(c1.course+ ":"+c1.fee);
        }//NPE
    }
}
