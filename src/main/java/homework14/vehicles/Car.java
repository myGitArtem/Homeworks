package homework14.vehicles;

import homework14.details.Engine;
import homework14.professions.Driver;
import homework14.professions.Person;

public class Car extends Driver {
    protected String carClass;
    protected String marka;
    protected double mass;
    Engine engine = new Engine();
    Driver driver = new Driver();
    Person person = new Person("ФИО", 20);

    public Car(Engine engine, Driver driver) {
        this.engine = engine;
        this.driver = driver;
    }

    public Car(String carClass, String marka, double mass) {
        this.carClass = carClass;
        this.marka = marka;
        this.mass = mass;
    }

    public String getCarClass() {
        return carClass;
    }

    public String getMarka() {
        return marka;
    }

    public double getMass() {
        return mass;
    }

    public Engine getEngine() {
        return engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public Person getPerson() {
        return person;
    }

    public Car() {

    }


    public static void start() {
        System.out.println("Поехали");
    }

    public static void stop() {
        System.out.println("Останавливаемся");
    }

    public static void turnRight() {
        System.out.println("Поворот направо");
    }

    public static void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", marka='" + marka + '\'' +
                ", mass=" + mass +
                ", engine=" + engine +
                ", driver=" + driver +
                ", person=" + person +
                '}';
    }
}
