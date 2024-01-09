public abstract class Figura {
    protected double a;
    protected double b;
    protected int factor;

    public Figura(double a, double b) {
        this.a = a;
        this.b = b;
        this.info();
    }

    public Figura(double a) {
        this.a = a;
        this.info();
    }


    public Figura(double a, int factor) {
        this.a = a;
        this.factor = factor;
    }

    public void info(){
        System.out.println("stworzono nowy obiekt oparty na klasie abstrakcyjnej Figura...");
    }
    public abstract double policzPole();
}
