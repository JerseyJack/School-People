package people;
import common.*;
import enums.StudentGroup;
import enums.PersonType;

public class Student extends People
{
    //Define varables
    protected PersonType person = PersonType.Student;
    protected String name;
    protected int age;
    protected Address address;
    protected StudentGroup group;

    //Constructor method
    public Student(String name, int age, Address address, StudentGroup group)
    {
        super(name, age, address);
        this.group = group;
    }

    //Overide master method
    @Override
    public String getPersonInfo()
    {
        String output = String.format("%s \n\n%s - %s \n%s \nPart of group: %s", getPersonType(), getName(), getAge(), getAddress(), getGroup());
        return output;
    }

    //Getter methods
    protected StudentGroup getGroup()
    {
        return group;
    }

    protected PersonType getPersonType()
    {
        return person;
    }

}
