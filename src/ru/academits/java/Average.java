package ru.academits.java;

import java.util.Scanner;

import static ru.academits.java.AverageWithFunction.getAverage;

public class Average {
    public static void main(String[] args) {
       int a = 5;
       int b = 6;

       double average = (double) (a + b) / 2;
       System.out.println("Average = " + average);

       getAverage(11, 16);
    }
}
