package ru.academits.java.OOP;

import java.time.LocalDate;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (!(middleName.length() == 0)) {
            this.middleName = middleName;
        }
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        if (!(familyName.length() == 0)) {
            this.familyName = familyName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + familyName + " " + name + " " + middleName + " " + age + "}";
    }

    public void printName() {
        System.out.println("Name = " + name);
    }

    public int getNowYear() {
        //Getting the current date value of the system
        LocalDate current_date = LocalDate.now();
//        System.out.println("Current date: "+current_date);

        //getting the current year from the current_date
        int current_Year = current_date.getYear();
//        System.out.println("Current year: "+current_Year);
        return current_Year;
    }
    public int getBirth(int age) {
        return (int) (getNowYear() - age);
    }

    public void yearOfBirth() {
        System.out.print("Год рождения = " + getBirth(age));
    }

}
