package parkingproblem;

import java.util.ArrayList;
import java.util.List;

class ParkingLot {

  private int capacity;
  private List<Vehicle> parkedVehicles;
  private int id;
  private ParkingAttendant attendant;


  ParkingLot(int capacity, int id) {
    this(capacity, id, null);
  }

  ParkingLot(int capacity, int id, ParkingAttendant attendant) {
    this.capacity = capacity;
    this.id = id;
    this.attendant = attendant;
    this.parkedVehicles = new ArrayList<>(capacity);
  }


  boolean park(Vehicle vehicle) {
    if (this.isFull()) {
      return false;
    }
    parkedVehicles.add(vehicle);

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
    for (int index = 0; index < this.parkedVehicles.size(); index++) {
      Vehicle parkedVehicle = this.parkedVehicles.get(index);
      if(parkedVehicle.getVehicleNumber() == vehicleNumber){
        this.parkedVehicles.remove(index);
        notifyAttendantIfParkingFree();
        return true;
      }
    }
    return false;
  }

  private void notifyAttendantIfParkingFree() {
    if(!this.isFull() && isAttendantPresent()){
      this.attendant.notifyParkingLotFree(this.id);
    }
  }

}
