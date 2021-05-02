package Section6_Classes_Constructors_Inheritance.Challenge1;

public class Car extends Vehicle{
    private int doors;
    private int gasTankSize;
    private int mpg;
    private String Brand;
    private String Model;

    public Car(String steering, String changingGear, int moving, int doors, int gasTankSize, int mpg, String brand, String model) {
        super(steering, changingGear, moving);
        this.doors = doors;
        this.gasTankSize = gasTankSize;
        this.mpg = mpg;
        Brand = brand;
        Model = model;
    }

    public void numDoors(int doors){
        System.out.println("The car has " + doors + " doors");
    }

    public void gasTank(int gasTankSize){
        System.out.println("The car has a " + gasTankSize + " gallon tank");
    }

    public void distance(){
        double distance = this.gasTankSize * this.mpg;
        System.out.println("The car can travel " + distance + " on a full tank of gas");
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGasTankSize() {
        return gasTankSize;
    }

    public void setGasTankSize(int gasTankSize) {
        this.gasTankSize = gasTankSize;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}
