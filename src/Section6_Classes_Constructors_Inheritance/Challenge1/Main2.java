package Section6_Classes_Constructors_Inheritance.Challenge1;

import Section6_Classes_Constructors_Inheritance.Cylinder.Circle;
import Section6_Classes_Constructors_Inheritance.Cylinder.Cylinder;
import Section6_Classes_Constructors_Inheritance.PoolArea.Cuboid;
import Section6_Classes_Constructors_Inheritance.PoolArea.Rectangle;

public class Main2 {
    public static void main(String[] args) {
/*        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.getRadius= " + cylinder.getRadius());
        System.out.println("cylinder.getHeight= " + cylinder.getHeight());
        System.out.println("cylinder.getArea= " + cylinder.getArea());
        System.out.println("cylinder.getVolume= " + cylinder.getVolume());*/

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
