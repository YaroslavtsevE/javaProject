package ru.academits.java;

public class LoopWhile {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;

        while (i <= 10) {
            sum = sum + i;
            ++i;
        }

        System.out.println("Сумма = " + sum);
    }
}
