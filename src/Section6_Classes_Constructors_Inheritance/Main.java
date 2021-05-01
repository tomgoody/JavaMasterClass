package Section6_Classes_Constructors_Inheritance;

public class Main {
    public static void main(String[] args) {
/*        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());


        Person  person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullname= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= " + person.getFullName());
 */

/*
       // BankAccount bank = new BankAccount();

        bank.setCustomerName("Tom");
        bank.setAccountNumber(123456);
        bank.setCustomerEmail("tgoody@hotmail.com");
        bank.setCustomerPhone("303.947.1111");
        bank.setBalance(100);
        System.out.println(bank.getCustomerName());
        System.out.println(bank.getCustomerEmail());
        System.out.println(bank.getCustomerPhone());
        System.out.println(bank.getAccountNumber());
        System.out.println(bank.getBalance());

        bank.deposit(10) ;
        bank.withdraw(100);


        BankAccount bob = new BankAccount(123, 0.00, "Bob", "", "");

        BankAccount next = new BankAccount();

        Wall wall = new Wall(5,4);
        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        Wall wall1 = new Wall(4.5, 2.0);
        System.out.println("width= " + wall1.getWidth());
        System.out.println("height= " + wall1.getHeight());
        System.out.println("area= " + wall1.getArea());


        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println( first.distance(0, 0));
        System.out.println(first.distance(second));
        Point  point = new Point();
        System.out.println(point.distance());
        System.out.println(point.distance(-1,-1));

 */
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

    }
}
