
public class Sport {
    String dyscyplina;
    String lata_upr;
    String best_wynik;

    public Sport(String dyscyplina, String lata_upr, String best_wynik) {
        this.dyscyplina = dyscyplina;
        this.lata_upr = lata_upr;
        this.best_wynik = best_wynik;
    }
    
    public String InfoSport(){
        return "dyscyplina: " + dyscyplina + "czas uprawiania [lata]: " + lata_upr + "życiówka: " + best_wynik;
    }
}
