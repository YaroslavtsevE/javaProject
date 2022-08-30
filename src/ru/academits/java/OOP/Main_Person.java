package ru.academits.java.OOP;

import java.util.Scanner;

public class Main_Person {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = scanner.nextLine();

        System.out.print("Введите фмилию: ");
        String familyName = scanner.nextLine();

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        Person person = new Person(name, middleName, familyName, age);

        person.setName("Petr");
        person.setFamilyName("Popov");
        person.setMiddleName("Petrovich");
//        person.setAge(18);

        System.out.println("Объект класса Person был создан: " + person);
    }
}
