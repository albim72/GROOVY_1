import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        StringTokenizer sq1 = new StringTokenizer("Jacek Agata Jan Olga Tomek Benek Jacek");
        StringTokenizer sq2 = new StringTokenizer("Jacek Agata Janusz Olga Tomek Barbara Jacek");


        System.out.println(sq1);
        while (sq1.hasMoreTokens())
            System.out.println(sq1.nextToken());

        System.out.println("________________________________________________");

        while (sq2.hasMoreTokens())
            System.out.println(sq2.nextToken());

        String delim = ", ";
        String imiona = "Jacek, Agata, Janusz, Olga, Tomek, Barbara, Jacek, Olgierd";
        StringTokenizer podzielimiona = new StringTokenizer(imiona,delim);
        int count = podzielimiona.countTokens();
        System.out.println("Liczba słów: " + count);

        for (int i=1;i<=count;i++){
            System.out.println("imie [" + i + "]: " + podzielimiona.nextToken());
        }

        System.out.println("____________________________________");

        while (podzielimiona.hasMoreTokens())
            System.out.println("imię: " + podzielimiona.nextToken());

    }
}
