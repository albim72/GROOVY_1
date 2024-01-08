public class TrzeciaKlasa extends DrugaKlasa implements InterTrzy {
    int d;
    public TrzeciaKlasa(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
    }

    @Override
    public void Opis() {
        System.out.println("to jest opis Trzeciej Klasa");

    }

    protected String printABCD() {
        return "wartość a: " + a + ", wartość b: " + b + ", wartość c: " + c + ", wartość d: " + d;}

    @Override
    public int policz() {
        return 1022;
    }

    @Override
    public double wynik(int a, double h) {
        return (a*2/(2+h));
    }

    @Override
    public int suma() {
        return super.suma() + d;
    }
}
