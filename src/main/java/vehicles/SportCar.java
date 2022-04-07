package vehicles;

public class SportCar extends Car {
    private double speed;

    public SportCar(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }
}
