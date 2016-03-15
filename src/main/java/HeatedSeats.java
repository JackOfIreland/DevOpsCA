public class HeatedSeats extends CarDecorator {
    private Car car;

    public HeatedSeats(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Heated Seats";
    }

    @Override
    public double cost() {
        return 700 + car.cost();
    }
}
