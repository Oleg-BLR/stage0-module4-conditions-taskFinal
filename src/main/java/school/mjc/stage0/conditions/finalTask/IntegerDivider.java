package school.mjc.stage0.conditions.finalTask;

import java.io.IOException;

public class IntegerDivider {
    public static void main(String[] args) {
        printCompletelyDivided(10, 2);
        printCompletelyDivided(9, 2);
        printCompletelyDivided(25, 0);
        printCompletelyDivided(-20, 4);
        printCompletelyDivided(20, -4);
    }
    public static void printCompletelyDivided(int dividend, int divider) {
        int divRes = 0;
        try {
            divRes = dividend / divider;
        } catch (Exception e) {
            System.out.println("division by zero\n");
        }
         if (divRes * divider == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }
}
