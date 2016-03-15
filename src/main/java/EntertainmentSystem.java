public class EntertainmentSystem extends CarDecorator {
    private Car car;

    public EntertainmentSystem(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "an Enterainment System";
    }

    @Override
    public double cost() {
        return 500 + car.cost();
    }
}
