package Section6_Classes_Constructors_Inheritance.Challenge1;

public class Carolla extends Car{
    private String color;

    public Carolla(String steering, String changingGear, int moving, int doors, int gasTankSize, int mpg, String brand, String model, String color) {
        super(steering, changingGear, moving, doors, gasTankSize, mpg, brand, model);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
