package parking_lot.service.parking_spot;

import parking_lot.service.vehicle.Vehicle;

public abstract class ParkingSpot {

    private int id;
    private boolean isFree;
    private Vehicle vehicle;

    public boolean getIsFree(){return false;};
    public abstract boolean assignVehicle(Vehicle vehicle);
    public boolean removeVehicle(){
        return false;
    }
}
