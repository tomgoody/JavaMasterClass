package Section6_Classes_Constructors_Inheritance;

import java.security.PrivateKey;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
        }
    public double getTotalCost(){
        double totalCost = carpet.getCost() * floor.getArea();
        return totalCost;
    }
}
