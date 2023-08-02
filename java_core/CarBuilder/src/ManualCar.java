public class ManualCar {
    int seats;
    String engine;
    String tripComputer;
    String GPS;

    private ManualCar() {
    }
    public static class ManualCarBuilder implements ICarBuilder {
        private ManualCar car;

        ManualCarBuilder() {
            this.car = new ManualCar();
        }

        public ManualCarBuilder setSeats(int seatNum) {
            this.car.seats = seatNum;
            return this;
        }

        public ManualCarBuilder setEngine(String engine) {
            this.car.engine = engine;
            return this;
        }

        public ManualCarBuilder setTripComputer(String tripComputer) {
            this.car.tripComputer = tripComputer;
            return this;
        }

        public ManualCarBuilder setGPS(String GPS) {
            this.car.GPS = GPS;
            return this;
        }

        public ManualCar getCar() {
            return this.car;
        }

        public void reset() {
            this.car = new ManualCar();
        }


    }

}
