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
        int sum = 0;

        if (IsTrue(a, b)) {

            while (i <= b) {
                sum = sum + i;
                ++i;
            }
            double average = sum / getCountFor(a, b);
            System.out.println("Average = " + average);
        } else {
            System.out.println("ERROR");
        }
    }

    public static double getCountFor(int a, int b) {
        if (a > b) {
            return (double) ((a - b) + 1);
        }
        return (double) ((b - a) + 1);
    }

    public static boolean IsTrue(int a, int b) {
        if ((a < b) && (a > 1) && (b <= 17)) {
            return true;
        }
        return false;
    }

    public static boolean IsEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

//    public static int getEvenSum(int a) {
//        for (int i = a; i <= b; i++) {
//            if (IsEven(i)) {
//                while (i <= b) {
//                    sum = sum + i;
//                    ++i;
//                }
//                double even = sum / getCountFor(a, b);
//                System.out.println("Average = " + average);
//
//            }
//        }
//    }
}

