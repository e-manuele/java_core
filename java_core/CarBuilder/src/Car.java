public class Car {
    int seats;
    String engine;
    String tripComputer;
    String GPS;

    private Car() {
    }

    public static class CarBuilder implements ICarBuilder {
        private Car car;

        CarBuilder() {
            this.car = new Car();
        }

        public CarBuilder setSeats(int seatNum) {
            this.car.seats = seatNum;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.car.engine = engine;
            return this;
        }

        public CarBuilder setTripComputer(String tripComputer) {
            this.car.tripComputer = tripComputer;
            return this;
        }

        public CarBuilder setGPS(String GPS) {
            this.car.GPS = GPS;
            return this;
        }

        public Car getCar() {
            return this.car;
        }

        public void reset() {
            this.car = new Car();
        }


    }

}
