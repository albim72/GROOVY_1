public class Main {

    public static void main(String[] args) {
        Prostokat pr = new Prostokat(4.6,8.8);
        String nazwa =  pr.getClass().getSimpleName();
        System.out.printf("Figura: %s, pole: %f cm2\n",nazwa,pr.policzPole());

        Trojkat tr = new Trojkat(6.6,8.9);
        nazwa =  tr.getClass().getSimpleName();
        System.out.printf("Figura: %s, pole: %f cm2\n",nazwa,tr.policzPole());

        Trapez trp = new Trapez(8.2,6.1,5);
        nazwa =  trp.getClass().getSimpleName();
        System.out.printf("Figura: %s, pole: %f cm2\n",nazwa,trp.policzPole());

        Kolo kl = new Kolo(5.5);
        nazwa =  kl.getClass().getSimpleName();
        System.out.printf("Figura: %s, pole: %f cm2\n",nazwa,kl.policzPole());

    }
}
