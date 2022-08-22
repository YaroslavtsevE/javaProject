package ru.academits.java;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.length() == 0){
            System.out.print("Введите ваше имя: ");
            name = scanner.nextLine();

            if (name.length() > 0) {
                System.out.println("Привет, " + name + "!");
            }
        }
    }
}
