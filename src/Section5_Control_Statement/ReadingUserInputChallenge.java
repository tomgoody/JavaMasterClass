package Section5_Control_Statement;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
                int order = count + 1;
                System.out.print("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int num = scanner.nextInt();

                count++;
                sum += num;
                if (count == 10){
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();

        }
        System.out.println("The sum of the numbers is: " + sum);
        scanner.close();
    }

}