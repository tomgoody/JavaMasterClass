package Section5_Control_Statement;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     //   System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2000));

/*        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-10));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(10));
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));*/

        String s = "Hello World! \n 3 + 3.0 = 6.0 true ";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);

        // print the next line
        System.out.println("" + scanner.nextLine());

        // print the next line again
        System.out.println("" + scanner.nextLine());

        // close the scanner
        scanner.close();
    }
}
