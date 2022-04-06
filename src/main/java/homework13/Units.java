package homework13;

public abstract class Units {
    protected int x;
    protected int y;
    protected boolean immortal = false;

    public Units(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isImmortal() {
        return immortal;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public abstract void draw();
}
