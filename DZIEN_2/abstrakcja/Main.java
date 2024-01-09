public class Main {
    public static void main(String[] args) {
        System.out.println("analiza kalsy abstrakcyjnej");
        Regular r = new Regular(5,8);
        r.info();
        System.out.println(r.policz());
        System.out.println(r.policzX());

    }
}
