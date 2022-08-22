package ru.academits.java;

import java.util.Scanner;

public class InputFromConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите число: ");
        int a = scanner.nextInt();

        System.out.println("Вы ввели число: " + a);
        System.out.printf("Вы ввели число: %d", a);

    }
}
