public enum Planeta {
    MERKURY(3.3e+23,2.4e+6),
    WENUS(4.87e+24,6.05e+6),
    ZIEMIA(5.97e+24,6.34e+6),
    MARS(6.42e+23,3.4e+6),
    JOWISZ(1.9e+27,7.14e+7),
    SATURN(5.69e+26,6.02e+7),
    URAN(8.68e+25,2.56e+7),
    NEPTUN(1.02e+26,2.47e+7),
    PLUTON(1.27e+22,1.14e+6);

    private final double masa;
    private final double promien;

    Planeta(double masa, double promien) {
        this.masa = masa;
        this.promien = promien;
    }
    
    public double masa(){return masa;}
    public double radius(){return promien;}
    
    public static final double G=6.673E-11;
    
    public double przeliczGrawitacje(){
        return G*masa/(promien*promien);
    }
    
    public double przeliczMasy(double innaMasa){
        return innaMasa*przeliczGrawitacje();
    }
}
