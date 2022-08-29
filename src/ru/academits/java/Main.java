package ru.academits.java;

public class Main {
    public static void main(String[] args) {

        int x = 8;
        int y = x * 2;

        System.out.println("y = " + y);



        String s1 = "Hello " + "world";
        String s2 = "Hello " + "world " + 300;

        System.out.println("Содержится? - " + s1.contains("world"));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("s1 = s2? " + s1.equals(s2));


        System.out.println("длина строки s2 = " + s2.length());
    }
}