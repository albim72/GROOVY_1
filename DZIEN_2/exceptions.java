public class Main {
    public static void main(String[] args) {

        int[] tablicaliczb = {1,4,6};
        int indeks = 4;

        try {
            int wartosc = tablicaliczb[indeks];
            System.out.println("Wartość z tablicy tablicaliczb: " + wartosc);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wyjątek: " + e);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            System.out.println("finally - blok wykonywany w każdym scenariuszu");
        }
        System.out.println("ciąg dalszy programu...");


    }
}
