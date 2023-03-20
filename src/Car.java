public class Car extends Vehicle {
  int numberOfSeats = 4;

  public Car(String licensePlate,int seatCount){
      super(licensePlate);
      this.numberOfSeats = seatCount;
  }

  @Override
  public void setLicensePlate (String licensePlate) {
    super.setLicensePlate("Car~"+licensePlate);
  }
}
