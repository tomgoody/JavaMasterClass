package Section5_Control_Statement;
//TODO This is good practice of for loops
public class SumOddRange {

    public static boolean isOdd(int num){
        if (num < 0){
            return false;
        }
        if (num % 2 == 0){
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;

        if ((end < start) || (start < 0 || end < 0)){
            return -1;
        }
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        return sum;
    }
}
