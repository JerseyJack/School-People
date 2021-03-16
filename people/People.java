package people;
import common.*;
import enums.*;

public abstract class People 
{

    //Define variables
    protected String name;
    protected int age;
    protected Address address;

    //Constructor method
    public People(String name, int age, Address address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Master get info method, this will be overidden in derived classes
    protected String getPersonInfo()
    {
        String output = String.format("%s - %s \n%s", getName(), getAge(), getAddress());
        return output;
    }

    //Getter methods
    protected String getName()
    {
        return name;
    }

    protected int getAge()
    {
        return age;
    }

    protected String getAddress()
    {
        String fullAddress = String.format(address.fullAddress());
        return fullAddress;
    }
    
    //Setting up the abstract class to force derived classes to use it
    protected abstract PersonType getPersonType();
}
