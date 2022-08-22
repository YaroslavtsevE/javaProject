package ru.academits.java;

public class LoopDoWhile {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;

        do {
            sum = sum + i;
            ++i;
        } while (i <= 9);

        System.out.println("Сумма = " + sum);
    }
}
