import java.util.Comparator;

public class SortbyName implements Comparator<Student>{
    @Override
    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}
