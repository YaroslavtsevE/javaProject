package ru.academits.java.AverageHome;

import java.util.Scanner;

public class AverageHome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число диапазона: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число диапазона: ");
        int b = scanner.nextInt();

        int i = a;
        int j = a;
        int k = a + 1;
        double sum = 0.0;
        double evensum = 0.0;

        if (a < b) {

            while (i <= b) {
                sum = sum + i;
                ++i;
            }

            if (a % 2 == 0) {
                while (j <= b) {
                    evensum = evensum + j;
                    j = j + 2;
                }
            }
            if (a % 2 != 0) {
                while (k <= b) {
                    evensum = evensum + k;
                    k = k + 2;
                }
            }

            double average = sum / getCountFor(a, b);
            double evenaverage = evensum / getEvenCountFor(a, b);
            System.out.println("Average = " + average);
            System.out.println("EvenAverage = " + evenaverage);
        } else {
            System.out.println("ERROR");
        }
    }

    public static double getCountFor(int a, int b) {
        return (double) ((b - a) + 1);
    }

    public static double getEvenCountFor(int a, int b) {
        if ((a % 2 != 0) && (b % 2 != 0)) {

            return (double) ((b - a) / 2);
        }
        if ((a % 2 == 0) && (b % 2 != 0)) {
            return (double) ((b - a) + 1) / 2;
        }
        return (double) ((b - a + 2) / 2);
    }
}

