package Section5_Control_Statement;

public class Sum3And5 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                count ++;
                System.out.println(i + " is divisible by 3 and 5");
                sum += i;
            }
            if (count == 5){
                break;
            }
        }
        System.out.println("The sum of these numbers is: " + sum);
    }
}
