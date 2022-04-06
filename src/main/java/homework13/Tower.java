package homework13;

public class Tower extends Units{

    public Tower(int x, int y) {
        super(x, y);
        immortal = true;
    }

    @Override
    public void draw() {
        System.out.println("This is tower");
    }
}
