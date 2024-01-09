import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Set<String> mojzbior = new HashSet<>();
        mojzbior.add("Polska");
        mojzbior.add("Francja");
        mojzbior.add("Niemcy");
        mojzbior.add("USA");
        mojzbior.add("Tajwan");
        mojzbior.add("Japonia");
        mojzbior.add("Tanzania");
        mojzbior.add("Niemcy");

        System.out.println(mojzbior);

        mojzbior.addAll(Arrays.asList(new String[]{"Norwegia","Finlandia","Szwecja"}));
        System.out.println(mojzbior);

    }
}
