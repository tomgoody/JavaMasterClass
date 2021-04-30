package Section6_Classes_Constructors_Inheritance;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
       if(age < 0 || age > 100) {
           return 0;
       }
       return age;
    }

    public boolean  isTeen(){
        return age >= 13 && age <= 19;
    }

    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "";
        } else if(firstName.isEmpty()){
            return lastName;
        }else if (lastName.isEmpty()){
            return firstName;
        }else{
            return firstName + " " + lastName;
        }
    }

}
