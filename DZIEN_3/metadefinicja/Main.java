package org.example;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        MojaKlasa obj = new MojaKlasa();
        Class<?> claz = obj.getClass();

        System.out.println("Nazwa klasy: " + claz.getName());

        //pobieranie listy pól klasy za pomocą refleksji
        Field[] fields = claz.getDeclaredFields();
        System.out.println("Pola klasy: ");
        for (Field field:fields){
            System.out.println(field.getName());
        }

    }
}
