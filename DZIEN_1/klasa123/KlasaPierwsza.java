public class KlasaPierwsza {
    int a;
    int b;
    public void info(){
        System.out.println("powstał nowy obiekt klasy KlasaPierwsza!");
    }

    public KlasaPierwsza(int a, int b) {
        this.a = a;
        this.b = b;
        this.info();
    }

    protected String printAB() {
        return "wartość a: " + a + ", wartość b: " + b;}
}
