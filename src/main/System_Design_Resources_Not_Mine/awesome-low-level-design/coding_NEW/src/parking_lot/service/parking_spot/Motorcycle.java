package parking_lot.service.parking_spot;

import parking_lot.service.vehicle.Vehicle;

public class Motorcycle extends ParkingSpot{
    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }
}
