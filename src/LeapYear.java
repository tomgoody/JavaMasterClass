public class LeapYear {

    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year > 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    leapYear = true;
                } else if (year == 1924);
            } else {
                leapYear = false;
            }
        }
            System.out.println(leapYear);
            return leapYear;

    }
}