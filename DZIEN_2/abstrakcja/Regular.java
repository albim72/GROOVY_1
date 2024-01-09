public class Regular extends Prototyp {
    int y;
    public Regular(int x, int y) {
        super(x);
        this.y=y;
    }

    @Override
    public double policz() {
        return 1004;
    }

    @Override
    public double policzX() {
        return x*(-2+y);
    }

    @Override
    public void niewiem() {

    }
}
