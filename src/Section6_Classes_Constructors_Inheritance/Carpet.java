package Section6_Classes_Constructors_Inheritance;

public class Carpet {
    private double cost;

    public Carpet(double cost){
        this.cost = cost;
    }

    public double getCost() {
        if (this.cost < 0) {
            this.cost = 0;
        }
        return this.cost;
    }


}

