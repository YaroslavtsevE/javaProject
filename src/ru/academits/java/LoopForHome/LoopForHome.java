package ru.academits.java.LoopForHome;

public class LoopForHome {
    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            if (IsDivisibleByFour(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean IsDivisibleByFour(int a) {
        if (a % 4 == 0) {
            return true;
        }
        return false;
    }
}
