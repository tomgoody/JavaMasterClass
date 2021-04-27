package Section5_Control_Statement;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 2; i < 9; i++){
            System.out.println("10000 at " + i + "% interest " + String.format("%.2f",calculateInterest(10000, i)));
        }
        System.out.println();
        //How to modify the loop above to do the same thing but start at 8% and work back to 2%
        for (int i = 8; i >= 2; i --){
            System.out.println("10000 at " + i + "% interest " + String.format("%.2f",calculateInterest(10000, i)));
        }
        System.out.println("********************");
        int count = 0;
        for(int i = 2; i < 200; i++){

            if (isPrime(i)){

                System.out.println(i + " is prime!");

                } else if(count >= 3) break;
                count++;
            }



    }
    public static boolean isPrime(int n) {
        if(n == 1){
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
