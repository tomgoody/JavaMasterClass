package Section5_Control_Statement;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
//        boolean first = true;



        while (true) {
                System.out.println("Enter number");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {

                int number = scanner.nextInt();
//                if (first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if (number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }

            } else {
                break;

            }
            scanner.nextLine(); //handle input
        }
        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);
        scanner.close();
    }
}
