//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("____________ PIERWSZA KLASA _______________");
        KlasaPierwsza pk = new KlasaPierwsza(3,7);
        System.out.println(pk.printAB());


        System.out.println("____________ DRUGA KLASA _______________");
        DrugaKlasa dk = new DrugaKlasa(4,7,2);
        System.out.println(dk.printAB());
        System.out.println(dk.printABC());
        System.out.println(dk.suma());

        System.out.println("____________ TRZECIA KLASA _______________");
        TrzeciaKlasa tk = new TrzeciaKlasa(2,9,6,4);

        System.out.println(tk.printAB());
        System.out.println(tk.printABC());
        System.out.println(tk.printABCD());

        System.out.println(tk.suma());
        tk.Opis();
        System.out.println(tk.policz());
        System.out.println(tk.wynik(7,8));

    }


}
