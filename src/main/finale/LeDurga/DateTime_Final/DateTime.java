package main.finale.LeDurga.DateTime_Final;

import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
//        LocalDate now = LocalDate.now();
//        LocalDate birthday = LocalDate.of(1998, 5, 15);
//        Period p = Period.between(birthday, now);
//        System.out.printf("My Age is %d years, %d months, %d days", p.getYears(), p.getMonths(), p.getDays());

        //LocalDate date = LocalDate.parse("",);
        //call();
//        Year y = Year.of(2012);
//        Boolean isLeap = isLeap(y.toString());
//        System.out.println(isLeap);
        again();

    }

    private static void again() {
        int[] arr1 = {10,20,30,40};
        int[] arr2 = {10,20,30,40};
        //int res = Arrays.;
    }

    private static Boolean isLeap(String y) {
        int yy = Integer.parseInt(y);
        if ((yy % 4 == 0 && yy % 100 != 0) || yy % 400 == 0) {
            return true;
        }
        return false;
    }

    private static void call() {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        ldt.minusDays(3);
        System.out.println(ldt);

        String s = "ABCD";
        s = s.concat("F");
        System.out.println(s);
    }
}

