package Section6_Classes_Constructors_Inheritance.Cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        if (radius < 0){
            this.radius = 0;
        }
    }

    public double getArea(){
        return (radius * radius * Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
