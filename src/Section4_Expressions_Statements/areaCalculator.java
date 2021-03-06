package Section4_Expressions_Statements;

public class areaCalculator {

    public static double area(double radius){
        if(radius < 0) {
            return -1.0;
        }
        double area = (Math.PI * Math.pow(radius, 2));
        return area;
    }

    public static double area(double x, double y){
        if (x <0 || y < 0){
            return -1.0;
        }
        double area = x * y;
        return area;
    }
}
