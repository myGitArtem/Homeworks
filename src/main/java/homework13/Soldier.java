package homework13;

public class Soldier extends MovableUnit {

    public Soldier(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("This is soldier");
    }
}
