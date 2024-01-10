public class Main {
    public static void main(String[] args) {

        StringBuilder str01 = new StringBuilder();
        str01.append("szkolenie  z zakresu programowania w języku Groovy");
        System.out.println("informacja: " + str01);

        StringBuilder znaki = new StringBuilder("ABNFSFHTEWSFHJDASDF");
        System.out.println("znaki: " + znaki);

        StringBuilder wart = new StringBuilder(233);
        System.out.println("wartość? : " + wart);
        System.out.println(wart.capacity());

        StringBuilder str02 = new StringBuilder(str01.toString());
        System.out.println("drugi tekst: " + str02);
        StringBuilder str03 = str01.reverse();
        System.out.println(str03);
        System.out.println(str01);

        StringBuilder str04 = new StringBuilder(str01.reverse());
        System.out.println(str04);
        System.out.println(str01);

        str01.reverse();
        System.out.println(str04);
        System.out.println(str01);
        System.out.println(str03);

    }
}
