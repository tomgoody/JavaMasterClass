package Section6_Classes_Constructors_Inheritance;

import java.lang.reflect.AccessibleObject;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // Default constructor
    public BankAccount(){
        this(123445, 0.00, "Default Name", "default email", "default phone");
    }

    // Constructor
    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, String customerPhone){
        System.out.println();
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this(9999, 0.00, customerName,customerEmail,customerPhone);
            }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone){
        this.customerPhone = customerPhone;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerEmail(){
        return customerEmail;
    }

    public String getCustomerPhone(){
        return customerPhone;
    }

    public void deposit(double deposit){
        this.balance += deposit;
        System.out.println("After deposit, the new balance is: " + balance);
    }

    public void withdraw(double withdraw){

        if (withdraw > this.balance){
            System.out.println("Insufficient Funds");
        } else {
            this.balance -= withdraw;
            System.out.println("The new balance is:" +  balance);
        }
    }
}
