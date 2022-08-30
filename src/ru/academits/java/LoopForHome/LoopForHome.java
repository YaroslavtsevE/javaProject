package ru.academits.java.LoopForHome;

public class LoopForHome {
{
    public static void main(String[] args) {
        int a = 100;
        boolean c = true;
        boolean isDivisibleByFour = getIsDivisibleByFour(100);
        for (int i = 100; i >= 1; i--) {
            if (getIsDivisibleByFour(i) == c) {
            System.out.print(i + " ");
            }
        }
}

        public static boolean getIsDivisibleByFour(int a)

    {
        if (a % 4 == 0) {
        return (boolean) (true);
        }
        else { return (boolean) (false);}
    }
}
}
