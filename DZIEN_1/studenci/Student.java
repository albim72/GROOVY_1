public class Osoba {
    //CTRL+D - duplikacja

    String imie;
    String nazwisko;
    String miejscowosc;
    Integer wiek;

    String koloroczu;
    public Osoba(String imie, String nazwisko, String miejscowosc, Integer wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
        this.wiek = wiek;
        this.koloroczu = "brązowe";
    }

    public Osoba(String imie, String nazwisko, String miejscowosc) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
    }

    public Osoba() {
    }

    public void printOsoba(){
        System.out.printf("Osoba -> imię: %s, nazwisko: %s, miejscowość: %s. wiek: %d\n",imie,nazwisko,miejscowosc,wiek);
    }

    public String getKoloroczu() {
        return koloroczu;
    }

    public void setKoloroczu(String koloroczu) {
        this.koloroczu = koloroczu;
    }
}
