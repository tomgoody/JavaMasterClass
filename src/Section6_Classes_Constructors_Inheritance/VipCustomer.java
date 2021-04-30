package Section6_Classes_Constructors_Inheritance;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("empty", "empty", 0.00);
        System.out.println("Empty Constructor");
    }
    public VipCustomer(String name, String email){
        this(name, email, 5000.0);
    }

    public VipCustomer(String name, String email, double creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
