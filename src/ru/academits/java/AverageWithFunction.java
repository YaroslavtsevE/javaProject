package ru.academits.java;

public class AverageWithFunction {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        double average = getAverage(14, 44);
        System.out.println("Average = " + average);
    }
    public static double getAverage(int a, int b) {
        return (double) (a + b) / 2;
    }
}
