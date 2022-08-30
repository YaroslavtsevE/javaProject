package ru.academits.java.LoopForHome;

public class LoopForHome {
    public static void main(String[] args) {

//        boolean isDivisibleByFour = getIsDivisibleByFour(100);
        for (int i = 100; i >= 1; i--) {
            if (getIsDivisibleByFour(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean getIsDivisibleByFour(int a) {
        if (a % 4 == 0) {
            return true;
        }
        return false;
    }
}
