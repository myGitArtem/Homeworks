package vehicles;

public class Lorry extends Car {
    private int carrying;

    public Lorry(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}
