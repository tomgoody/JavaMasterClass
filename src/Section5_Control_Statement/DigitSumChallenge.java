package Section5_Control_Statement;

public class DigitSumChallenge {
    public static void main(String[] args) {
    //    System.out.println(sumDigits(123456));

        System.out.println(sumDigitsResult(125));
    }

    public static int sumDigits(int number){
        int sum = 0;
        int n = 0;
        String s = String.valueOf(number);

        if (number <= 9 || number < 0){
            return -1;
        }
        while (n <= s.length()){
            int i = 0;
            i = number % 10;
            number -= i;
            sum += i;
            number = number / 10;
            n++;
        }
        return sum;
    }

    public static int sumDigitsResult(int number){
        if (number < 10){
            return -1;
        }
        int sum = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number>0){
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least-significant digit
            number /= 10;
        }
        return sum;
    }
}
