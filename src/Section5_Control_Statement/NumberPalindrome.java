package Section5_Control_Statement;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        //Math.abs takes the original number and converts it to a positive number because absolute value
        // shows how far that number is from 0 and always returns positive.
        number = Math.abs(number);
        int numberCopy = number;
        int reverse = 0;
        int lastDigit = 0;

        while (numberCopy > 0){
            //Line 13 takes the original number and assigns the return of dividing it by 10 to last digit.
            lastDigit = numberCopy % 10;
        /*This is using a power of 10 to move the last digit to the front and the first digit to the last
        * place. So the first iteration starts with 0 * 10, that places the number in the ones place and assigns it to reverse.        *
        * The next iteration is the new reverse number in the ones place * 10. Then adding the new number to it.
        * This makes reverse now the first number in the tens spot and the second number in the ones spot.
        *
        * This continues until numberCopy is no longer greater than zero  */

            reverse = reverse * 10 + lastDigit;

            /*This removes the last number off taking it from x to x-1*/
            numberCopy /= 10;

        }
        if (reverse == number) {
            return true;
        }
        return false;
    }
}
