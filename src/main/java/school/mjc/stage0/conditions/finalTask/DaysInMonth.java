package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public static void main(String[] args) {
        printDays(2000, 2);
        printDays(2001, 2);
        printDays(2000, 1);
        printDays(0, 1);
        printDays(-2, 1);
        printDays(2000, 13);
        printDays(2000, -13);
    }

    public static void printDays(int year, int month) {
        if (year <= 0 || month <= 0 || month > 12) {
            System.out.println("invalid date");
        } else {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println(31);
                    break;
                case 4, 6, 9, 11:
                    System.out.println(30);
                    break;
                case 2:
                    if (isLeapYear(year) == true) {
                        System.out.println(29);
                    } else {
                        System.out.println(28);
                    }
            }
        }
    }

    public static boolean isLeapYear(int year) {
        int check4 = year % 4;
        int check100 = year % 100;
        int check400 = year % 400;
        boolean leapYear = false;
        switch (check400) {
            case (0):
                leapYear = true;
                break;
            default:
                switch (check100) {
                    case (0):
                        leapYear = false;
                        break;
                    default:
                        switch (check4) {
                            case (0):
                                leapYear = true;
                                break;
                        }
                        break;
                }
                break;
        }

        if (leapYear) {
            return true;
        } else {
            return false;
        }

    }
}
