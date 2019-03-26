package parkingproblem;

class ParkingAttendant {

  void notifyParkingLotFull(Integer parkingLotID) {
    System.out.println("Parking Lot " + parkingLotID + " is full.");
  }

  void notifyParkingLotFree(Integer parkingLotID) {
    System.out.println("Parking Lot " + parkingLotID + " is free now.");
  }
}
