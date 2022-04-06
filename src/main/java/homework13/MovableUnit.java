package homework13;

public abstract class MovableUnit extends Units{

    public MovableUnit(int x, int y) {
        super(x, y);
    }
    public void move() {
        x++;
        y++;
    }
    public void fire() {
        System.out.println("fire");
    }
}
