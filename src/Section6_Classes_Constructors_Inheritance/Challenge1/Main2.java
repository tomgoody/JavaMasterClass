package Section6_Classes_Constructors_Inheritance.Challenge1;

public class Main2 {
    public static void main(String[] args) {
        Carolla carolla = new Carolla("left", "manual", 35,4,15, 30,"Toyota",
                "Carolla", "white");

        carolla.manualAuto();
        carolla.steeringLoc();
        carolla.distance();
        carolla.move();
    }
}
