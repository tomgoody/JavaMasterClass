package Section5_Control_Statement;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(41,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        if ((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)){
            return false;
        }
        int lastN1 = num1 % 10;
        int lastN2 = num2 % 10;
        int lastN3 = num3 % 10;

        if (lastN1 == lastN2 || lastN1 == lastN3 || lastN2 == lastN3){
            return true;
        }
        return false;
    }

    public static boolean isValid(int num4){
        if (num4 < 10 || num4 > 1000){
            return false;
        }
        return true;
    }
}
