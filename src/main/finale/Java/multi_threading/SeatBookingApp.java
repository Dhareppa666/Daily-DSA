package main.finale.Java.multi_threading;

public class SeatBookingApp extends Thread {

    static BookTheaterSeat bs;

    private String name;

    int noOfSeats;

    public static void main(String[] args) {

        bs = new BookTheaterSeat();

        SeatBookingApp aa = new SeatBookingApp();
        aa.name = "Cust1";
        aa.noOfSeats = 6;

        SeatBookingApp bb = new SeatBookingApp();
        bb.name = "Cust2";
        bb.noOfSeats = 7;

        SeatBookingApp cc = new SeatBookingApp();
        cc.name = "Cust3";
        cc.noOfSeats = 9;

        SeatBookingApp dd = new SeatBookingApp();
        dd.name = "Cust4";
        dd.noOfSeats = 3;

        aa.start();
        bb.start();
        cc.start();
        dd.start();

    }

    @Override
    public void run() {
        bs.bookSeats(noOfSeats, name);
    }
}


class BookTheaterSeat {

    int totalSeats = 10;

    synchronized void bookSeats(int noOfSeats, String custName) {
        if (totalSeats >= noOfSeats) {
            System.out.println(noOfSeats + " has been booked for Cust :" + custName);
            totalSeats = totalSeats - noOfSeats;
        } else {
            System.out.println("No seats has been booked for Cust :" + custName);
        }
        System.out.println("Total seats left :" + totalSeats);
    }
}