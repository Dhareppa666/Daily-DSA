package parking_lot;

import parking_lot.service.entry_exit.Entrance;
import parking_lot.service.entry_exit.Exit;
import parking_lot.service.parking_rate.ParkingRate;
import parking_lot.service.parking_spot.ParkingSpot;
import parking_lot.service.parking_ticket.ParkingTicket;
import parking_lot.service.vehicle.Vehicle;

import java.util.HashMap;

public final class ParkingLot {
    private int id;
    private String name;
    private String address;
    private ParkingRate parkingRate;

    private HashMap<String, Entrance> entrance;
    private HashMap<String, Exit> exit;

    private HashMap<String, ParkingTicket> tickets;

    private static ParkingLot parkingLot = null;

    private ParkingLot() {
        // Call the name, address and parking_rate
        // Create initial entrance and exit hashmaps respectively
    }

    // Created a static method to access the singleton instance of ParkingLot
    public static ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public boolean addEntrance(Entrance entrance) {
        return false;
    }

    public boolean addExit(Exit exit) {
        return false;
    }

    // This function allows parking tickets to be available at multiple entrances
    public ParkingTicket getParkingTicket(Vehicle vehicle) {
        return null;
    }

    public boolean isFull(ParkingSpot parkingSpot) {
        return parkingSpot.getIsFree();
    }

}
