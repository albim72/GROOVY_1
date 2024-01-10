package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("____________________________________________");
        GenericsType<Double> g1 = new GenericsType<Double>();
        g1.setT(12.4234);

        GenericsType<Double> g2 = new GenericsType<Double>();
        g2.setT(12.454);

        boolean isEqual = GMethods.<Double>isEqual(g1,g2);
        System.out.println(isEqual);

        isEqual = GMethods.isEqual(g1,g2);
        System.out.println(isEqual);

        System.out.println("____________________________________________");
        GenericsType<String> s1 = new GenericsType<>();
        s1.setT("Jacek");

        GenericsType<String> s2 = new GenericsType<>();
        s2.setT("Jacek");

        isEqual = GMethods.isEqual(s1,s2);
        System.out.println(isEqual);

        System.out.println("____________________________________________");

        Twice<String,Integer> tw1 = new Twice<>("kolor nr 45",45);
        tw1.print();

        Twice<Boolean,Double> tw2 = new Twice<>(true,46.3454);
        tw2.print();



    }
}
