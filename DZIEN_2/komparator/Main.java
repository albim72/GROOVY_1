import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student(56,"Jan","Kraków"));
        ar.add(new Student(45,"Olga","Lublin"));
        ar.add(new Student(78,"Anna","Katowice"));
        ar.add(new Student(98,"Karol","Łódź"));

        System.out.println("nieposortowane...");

        for (int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        Collections.sort(ar,new SortbyName());
        System.out.println("posortowane po imieniu...");

        for (int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

    }
}
