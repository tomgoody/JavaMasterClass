package Section5_Control_Statement;
//TODO do this again
public class GreatestCommonDivisor {
    public static void main(String[] args) {

    }
/*    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        *//*GCD is found by comparing the 2 numbers.  Set the larger number = to the smaller number times
        * the number of times larger can be divided by smaller, plus the remainder.
        * Repeat until remainder is 0, when remainder is 0, the previous Remainder is GCD.
        * Ln = Sn * quotient + remainder
        * *//*
        int n1;
        int n2;
        int remainder;
        int gcd = 0;

        if (first > second) {
            n1 = first;
            n2 = second;
        } else {
            n1 = second;
            n2 = first;
        }

           do {
               if( n1 / n2 == 0){
                   remainder = n1 / n2;
                   return remainder;
               } else {
                  remainder = n1 % n2;
                  if (remainder == 0){
                      gcd =n2;
                      break;
                  }
                   gcd = remainder;
                   n1 = n2;
                   n2 = remainder;
                   continue;
               }

           }while (remainder > 0);

           return gcd;
        }*/

    public static int gCD1(int first, int second){
        if(first >= 10 && second >= 10){
            int smallerNum = Math.min(first, second);

            for(int gcd = smallerNum; gcd > 0; gcd--){
                if ((first % gcd == 0) && (second % gcd == 0)){
                    return gcd;
                }
            }
        }
        return -1;
    }
}


