package Section5_Control_Statement;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        int lastNum = number % 10;
        int firstNum = 0;
        int loop = 0;

        if (number < 0){
            return -1;
        }

       do {
            loop= number % 10;
            number /= 10;

        }while(number > 0);
       firstNum += loop;
        return lastNum + firstNum;
    }
}
