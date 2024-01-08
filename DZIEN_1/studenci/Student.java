public class Student extends Osoba {
    String nrAlbumu;
    String uczelnia;
    String kierunek;

    public Student(String imie, String nazwisko, String miejscowosc, Integer wiek, String nrAlbumu, String uczelnia, String kierunek) {
        super(imie, nazwisko, miejscowosc, wiek);
        this.nrAlbumu = nrAlbumu;
        this.uczelnia = uczelnia;
        this.kierunek = kierunek;
    }

    @Override
    public void printOsoba() {
        super.printOsoba();
        System.out.println("Student: " + nrAlbumu + ", uczelnia: " + uczelnia + ", kierunek" + kierunek);
    }
}

