package parking_lot.service.parking_spot;

import parking_lot.service.vehicle.Vehicle;

public class Handicapped extends ParkingSpot{
    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }
}
