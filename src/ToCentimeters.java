//TODO practice this example again.
public class ToCentimeters {
    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(6,10);
        calcFeetAndInchesToCentimeters(66);
        calcFeetAndInchesToCentimeters(157);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0 || (inches < 0 || inches > 12))){
            System.out.println("invalid feet or inches");
            return -1;
        }
        double centimeter = ((feet * 12) + inches) * 2.54;
        System.out.println(feet + " feet, " + inches + " inches is " + centimeter + " centimeters");
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is " + feet + " feet " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
