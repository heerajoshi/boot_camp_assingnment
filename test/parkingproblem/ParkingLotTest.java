package parkingproblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

  @Test
  void shouldParkAVehicleToParkingLotIfThereIsSpace() {
    ParkingLot parkingLot = new ParkingLot(2,1);
    assertTrue(parkingLot.park(new Vehicle(123)));
  }

  @Test
  void shouldNotParkVehicleIfParkingLotIsAlreadyFull() {
    ParkingLot parkingLot = new ParkingLot(2, 1);
    parkingLot.park(new Vehicle(123));
    parkingLot.park(new Vehicle(120));
    assertFalse(parkingLot.park(new Vehicle(127)));
  }

  @Test
  void shouldReturnTrueIfParkingLotIsFull() {
    ParkingLot parkingLot = new ParkingLot(2, 1);
    parkingLot.park(new Vehicle(123));
    parkingLot.park(new Vehicle(120));
    assertTrue(parkingLot.isFull());
  }

  @Test
  void shouldReturnFalseIfParkingLotIsNotFull() {
    ParkingLot parkingLot = new ParkingLot(2, 1);
    parkingLot.park(new Vehicle(123));
    assertFalse(parkingLot.isFull());
  }

  @Test
  void shouldNotifyItsParkingAttendantsWhenParkingLotIsFull() {
    MockAttendant mockAttendant = new MockAttendant();

    ParkingLot parkingLot = new ParkingLot(2, 1223, mockAttendant);
    parkingLot.park(new Vehicle(123));
    parkingLot.park(new Vehicle(120));

    assertTrue(mockAttendant.hasAttendantBeenNotifiedFull);
  }

  @Test
  void shouldNotifyItsParkingAttendantWhenParkingLotIsAgainFree() {
    MockAttendant mockAttendant = new MockAttendant();
    ParkingLot parkingLot = new ParkingLot(2, 1, mockAttendant);

    parkingLot.park(new Vehicle(123));
    parkingLot.park(new Vehicle(120));

    parkingLot.unpark(123);

    assertTrue(mockAttendant.hasAttendantBeenNotifiedFree);
  }
}


class MockAttendant extends ParkingAttendant{
  boolean hasAttendantBeenNotifiedFull = false;
  boolean hasAttendantBeenNotifiedFree = false;

  @Override
  void notifyParkingLotFull(Integer parkingLotID) {
    hasAttendantBeenNotifiedFull = true;
  }

  @Override
  void notifyParkingLotFree(Integer parkingLotID) {
    hasAttendantBeenNotifiedFree = true;
  }

}