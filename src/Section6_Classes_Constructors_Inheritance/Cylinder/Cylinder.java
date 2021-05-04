package Section6_Classes_Constructors_Inheritance.Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if (height < 0){
            this.height = 0;
        }
    }

    public double getVolume(){
        return getArea() * this.height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
