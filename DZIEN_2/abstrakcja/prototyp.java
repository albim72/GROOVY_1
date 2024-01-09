public abstract class Prototyp {
    protected int x;

    public Prototyp(int x) {
        this.x = x;
    }

    public void info(){
        System.out.println("to jest metoda nieabstrakcyjna klasy abstrakcyjnej");
    }
    public abstract double policz();
    public abstract double policzX();

    public abstract void niewiem();
}
