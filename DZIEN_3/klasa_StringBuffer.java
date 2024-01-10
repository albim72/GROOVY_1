public class Main {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("to jest tekst do wyświetlenia! kilka słów więcej... " +
                "mamy piękną zimową pogodę");
        int p = s.length();
        int q = s.capacity();
        System.out.println("długość s: " + p);
        System.out.println("pojemność s: " + q);

        StringBuffer imie = new StringBuffer("Jan");
        StringBuffer nazwisko = new StringBuffer("Nowak");

        imie.append(" Jacek");
        System.out.print(imie);
        System.out.println(" " + nazwisko);

        StringBuffer miasto = new StringBuffer("KrakówWarszawaŁódźLublin");
        miasto.insert(6,", ");
        miasto.insert(16,", ");
        miasto.insert(22,", ");

        System.out.println(miasto);
        miasto.reverse();
        System.out.println(miasto);

        miasto.delete(0,9);
        System.out.println(miasto);

        miasto.reverse();
        System.out.println(miasto);

        miasto.deleteCharAt(7);
        System.out.println(miasto);

        miasto.replace(4,6,"owianka");
        System.out.println(miasto);

        String zs = "to jest wartość typu String";

        System.out.println(zs);
//        zs.reverse();
//        System.out.println(zs);

    }
}
