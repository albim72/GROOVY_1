public class Main {
    public static void main(String[] args) {
        double masa_na_ziemi = 83;
        double masa = masa_na_ziemi/Planeta.ZIEMIA.przeliczGrawitacje();

        for(Planeta p:Planeta.values())
            System.out.printf("Twoja masa na %s wynosi %.2f kg\n",p,p.przeliczMasy(masa));
    }
}
