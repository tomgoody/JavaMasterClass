package Section5_Control_Statement;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number > 1) {

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
                if (sum == number) {
                    return true;
                }
            }
        }
        return false;
    }
}
