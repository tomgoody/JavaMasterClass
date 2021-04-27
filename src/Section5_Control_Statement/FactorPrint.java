package Section5_Control_Statement;
//TODO do this again
public class FactorPrint {
    public static void main(String[] args) {
        printFactors(6);
    }
    public static void printFactors(int number){
        int factor;
        if (number >= 1){
            for (int i = 1; i <= number; i++){
                if (number % i == 0){
                    factor = i;
                    System.out.println(factor);
                }
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
