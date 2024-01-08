import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int n = 5;
        ArrayList<Integer> arrli = new ArrayList<>(n);

        for (int i = 1; i <= n; i++)
            arrli.add(i);

        System.out.println(arrli);

        for (int i = 0; i < arrli.size(); i++) {
            System.out.print(arrli.get(i) + " ");
        }
    }
}
