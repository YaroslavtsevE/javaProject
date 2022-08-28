package ru.academits.java.LoopForHome;

public class LoopForHome {
    public static void main(String[] args) {
        int a = 100;
        int b = 4;

        int value = getValue(100, 4);
        int step = getStep(100, 4);


        for (int i = 100; i >= 1; i--) {
            if (value == step) {
                System.out.print(i + "_");
            }
        }
        }
//    public static int getValue(int a, int b) {
//        for (int a = 100; a >= 1; a / b)
//        return (int) a / b;
//    }

    public static int getValue(int a, int b) {
        return (int) a / b;
    }

    public static int getStep(int a, int b) {
        return (int) a - b;
    }

}
