package Section6_Classes_Constructors_Inheritance.Inheritance;

public class Main1 {
    public static void main(String[] args) {


        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Shorkie", 9, 20, 2, 4, 1, 20, "long silky");
        dog.walk();

       // dog.run();
    }
}
