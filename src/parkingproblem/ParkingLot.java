package parkingproblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ParkingLot {

  private int capacity;
//  private List<Vehicle> parkedVehicles;
  private Map<Integer, Vehicle> parkedVehicles;
  private int id;
  private ParkingAttendant attendant;


  ParkingLot(int capacity, int id) {
    this(capacity, id, null);
  }

  ParkingLot(int capacity, int id, ParkingAttendant attendant) {
    this.capacity = capacity;
    this.id = id;
    this.attendant = attendant;
    this.parkedVehicles = new HashMap<>(capacity);
  }


  boolean park(Vehicle vehicle) {
    if (this.isFull()) {
      return false;
    }
    parkedVehicles.put(vehicle.getVehicleNumber(),vehicle);

    notifyAttendantIfParkingFull();
    return true;
  }

  private void notifyAttendantIfParkingFull() {
    if(this.isFull() && isAttendantPresent()){
      this.attendant.notifyParkingLotFull(this.id);
    }
  }

  private boolean isAttendantPresent() {
    return this.attendant != null;
  }

  boolean isFull() {
    return parkedVehicles.size() == capacity;
  }

  boolean unpark(int vehicleNumber) {
    Vehicle removedVehicle = this.parkedVehicles.remove(vehicleNumber);
    if(removedVehicle == null) return false;
    notifyAttendantIfParkingFree();
    return true;
  }

  private void notifyAttendantIfParkingFree() {
    if(!this.isFull() && isAttendantPresent()){
      this.attendant.notifyParkingLotFree(this.id);
    }
  }

}
