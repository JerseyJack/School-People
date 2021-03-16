package people;
import common.*;
import enums.CurriculumType;
import enums.PersonType;

public class Lecturer extends People
{

    //Define varables
    protected PersonType person = PersonType.Lecturer;
    protected String name;
    protected int age;
    protected Address address;
    protected CurriculumType curriculum;
    protected String teacherNumber;
    protected Boolean qts = false;


    //Construtor methods using method overloading for is teachers have teaching numbers and/or QTS
    public Lecturer(String name, int age, Address address, CurriculumType curriculum)
    {
        super(name, age, address);
        this.curriculum = curriculum;
    }

    public Lecturer(String name, int age, Address address, CurriculumType curriculum, String teacherNumber)
    {
        super(name, age, address);
        this.curriculum = curriculum;
        this.teacherNumber = teacherNumber;
    }

    public Lecturer(String name, int age, Address address, CurriculumType curriculum, String teacherNumber, Boolean qts)
    {
        super(name, age, address);
        this.curriculum = curriculum;
        this.teacherNumber = teacherNumber;
        this.qts = true;
    }

    //Override master method
    @Override
    public String getPersonInfo()
    {
        String output = String.format("%s \n\n%s - %s \n%s \nCurriculum Area: %s \nTeacher Number: %s \nQTS Status: %s", getPersonType(), getName(), getAge(), getAddress(), getCurriculum(), getTeacherNumber(), getQTS());
        return output;
    }

    //Getter methods
    protected CurriculumType getCurriculum()
    {
        return curriculum;
    }

    protected String getTeacherNumber()
    {
        return teacherNumber;
    }

    protected String getQTS()
    {
        if (qts == false)
        {
            return "Not Acquired";
        }
        else
        {
            return "Acquired";
        }
    }

    protected PersonType getPersonType()
    {
        return person;
    }
}
