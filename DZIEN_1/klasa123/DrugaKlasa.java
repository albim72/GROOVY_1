public class DrugaKlasa extends KlasaPierwsza{
    int c;

    public DrugaKlasa(int a, int b, int c) {
        super(a, b);
        this.c = c;

    }
    protected String printABC() {
        return "wartość a: " + a + ", wartość b: " + b + "wartość c" + c;}
    
    public int suma() {return a+b+c;}
}
