package parking_lot.service.parking_ticket;

import parking_lot.service.entry_exit.Entrance;
import parking_lot.service.entry_exit.Exit;
import parking_lot.service.payment.Payment;
import parking_lot.service.vehicle.Vehicle;

import java.util.Date;

public class ParkingTicket {

    private int ticketNumber;
    private Date entryTimestamp;
    private Date exitTimestamp;
    private double amount;
    private boolean status;


    private Vehicle vehicle;
    private Payment payment;
    private Entrance entrance;
    private Exit exit;
}
