package Section5_Control_Statement;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        } else {
            switch (month) {
                case 1:
                    System.out.println("31");
                    isLeapYear(year);
                    break;
                case 2:
                    if (isLeapYear(year) == true) {
                        System.out.println("29");
                    } else {
                        System.out.println(28);
                    }
                    break;
                case 3:
                    System.out.println("31");
                    isLeapYear(year);
                    break;
                case 4:
                    System.out.println("30");
                    isLeapYear(year);
                    break;
                case 5:
                    System.out.println("31");
                    isLeapYear(year);
                    break;
                case 6:
                    System.out.println("31");
                    isLeapYear(year);
                    break;
                case 7:
                    System.out.println("31");
                    isLeapYear(year);
                    break;
                case 8:
                    System.out.println("31");
                    isLeapYear(year);
                    break;
                case 9:
                    System.out.println("31");
                    isLeapYear(year);
                    break;
                case 10:
                    System.out.println("31");
                    isLeapYear(year);
                    break;
                case 11:
                    System.out.println("31");
                    isLeapYear(year);
                    break;
                case 12:
                    System.out.println("31");
                    isLeapYear(year);
                    break;
                default:

            }
        }

    }
}
