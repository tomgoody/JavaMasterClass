package Section5_Control_Statement;

public class ParsingVaulesFromString {
    public static void main(String[] args) {
        String numberAsString = "2018.15";
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString);
        System.out.println(number);
    }

}
