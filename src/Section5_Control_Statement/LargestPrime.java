package Section5_Control_Statement;

public class LargestPrime {
    public static void main(String[] args) {
/*        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));*/
        System.out.println(getLargestPrime(31));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(1));
    }

    public static int getLargestPrime(int number) {
        if (number >= 2) {
            // i is less than the number. if remainder of num/i == 0.  then number is divided by i and the results assigned to number
            // i is then set to i-i. so 1 less than the number that divided into it.
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }
            }
            return number;
        }
        return -1;
    }

}
