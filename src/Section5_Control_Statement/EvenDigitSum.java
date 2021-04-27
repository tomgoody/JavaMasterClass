package Section5_Control_Statement;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        int even = 0;
        int loop = 0;

        if (number < 0){
            return -1;
        }

        do {
            loop= number % 10;
            number /= 10;

            if (loop % 2 == 0){
                even += loop;
            }
        }while (number > 0);

        return even;
    }
}
