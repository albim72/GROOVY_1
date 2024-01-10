package org.example;

public class Main {
    public static void main(String[] args) {

        Testowa<Integer> iObj = new Testowa<>(14);
        System.out.println(iObj.getObject());

        Testowa<String> sObj = new Testowa<>("ważna informacja...");
        System.out.println(sObj.getObject());

        Testowa<Double> dObj = new Testowa<>(9.99);
        System.out.println(dObj.getObject());


    }
}
