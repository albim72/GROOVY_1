import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("to jest moja nowa linia");

        int a = 8;
        double b = 13.56;
        double c = b/a;

        System.out.println(c);

        int v = 8;
        double k = (double)v/a;
        int suma = a+v;
        System.out.println("suma: " + suma);
        System.out.println(k);

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą a: ");
        int ax = in.nextInt();

        System.out.println("Podaj liczbę całkowitą b: ");
        int bx = in.nextInt();

        int pot = (int)Math.pow(ax,bx);
        System.out.println("potęga wynosi: " + pot);

        System.out.println("Podaj cenę produktu w zł: ");
        double cena = in.nextDouble();

        double rabat = cena*0.25;

        System.out.println("Rabat 25% = " + rabat);
    }
}
