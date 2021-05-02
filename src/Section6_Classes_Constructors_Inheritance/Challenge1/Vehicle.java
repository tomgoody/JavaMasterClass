package Section6_Classes_Constructors_Inheritance.Challenge1;

public class Vehicle {
    private String steering;
    private String changingGear;
    private int moving;

    public Vehicle(String steering, String changingGear, int moving) {
        this.steering = steering;
        this.changingGear = changingGear;
        this.moving = moving;
    }

    public void steeringLoc(){
        System.out.println("The steering wheel is located on the: " + steering);
    }

    public void manualAuto(){
        System.out.println("The vehicle has a " + changingGear + " transmission");
    }

    public void move(){
        if (moving == 0){
            System.out.println("The vehicle is in park");
        } else {
            System.out.println("The vehicle is moving at " + moving + "mph");
        }
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public String getChangingGear() {
        return changingGear;
    }

    public void setChangingGear(String changingGear) {
        this.changingGear = changingGear;
    }

    public int getMoving() {
        return moving;
    }

    public void setMoving(int moving) {
        this.moving = moving;
    }
}
