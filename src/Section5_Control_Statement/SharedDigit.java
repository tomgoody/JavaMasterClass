package Section5_Control_Statement;

public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2){
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int nstore = 0;

        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)){
            return false;
        }
          while (num1 > 1){
              nstore = num1 % 10;
              n2 = nstore;
              nstore = num1 /= 10;
              n1 = nstore;
              num1 /= 10;

          }

          while (num2 > 1){
              nstore = num2 % 10;
              n4 = nstore;
              nstore = num2 /= 10;
              n3 = nstore;
              num2 /= 10;

          }
          if ((n1 == n3 || n1 == n4) || (n2 == n3 || n2 == n4)){
              return true;
          }
          return false;
    }
}
