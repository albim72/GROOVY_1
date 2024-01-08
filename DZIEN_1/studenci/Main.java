//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Osoba os1 = new Osoba("Marta","Olech","Kraków",34);
        System.out.println(os1);
        os1.printOsoba();

        Student st1 = new Student("Olaf","Knot","Lublin",29,"R34535",
                "UMCS","Informatyka");
        st1.printOsoba();

        Osoba st2 = new Student("Olaf","Kowal","Lublin",33,"R348998",
                "WSPA","Zarządzanie");
        st2.printOsoba();

        Osoba st3 = (Osoba)st1;
        st3.printOsoba();

    }
}
