public class Main {

    public static void main(String[] args) {
        Prostokat pr = new Prostokat(4.6,8.8);
        String nazwa =  pr.getClass().getSimpleName();
        System.out.printf("Figura: %s, pole: %f cm2\n",nazwa,pr.policzPole());

        Trojkat tr = new Trojkat(6.6,8.9);
        nazwa =  tr.getClass().getSimpleName();
        System.out.printf("Figura: %s, pole: %f cm2\n",nazwa,tr.policzPole());

    }
}
