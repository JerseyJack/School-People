import common.*;
import people.*;
import enums.*;

public class Application 
{
    public static void main (String[] args)
    {
        createStudent();
        createLecturer();
    }

    public static void createStudent()
    {
        //Create student
        Student student = new Student("Jimbob Francis", 15, new Address("1 Street Ln.", "England", "BH2 3JL"), StudentGroup.Blue);
        System.out.println("------------------\n\n" + student.getPersonInfo() + "\n\n------------------");
    }

    public static void createLecturer()
    {
        //Create lecturer with no teacher number, or QTS
        Lecturer lecturer = new Lecturer("Peter Chad", 42, new Address("234 Avenue Rd.", "England", "BH15 5NI"), CurriculumType.English);
        System.out.println("------------------\n\n" + lecturer.getPersonInfo() + "\n\n------------------");

        //Create lecturer with no QTS
        Lecturer lecturer2 = new Lecturer("Peter Chad", 42, new Address("234 Avenue Rd.", "England", "BH15 5NI"), CurriculumType.English, "402182723");
        System.out.println("------------------\n\n" + lecturer2.getPersonInfo() + "\n\n------------------");

        //Create lecturer with both teacher number and QTS
        Lecturer lecturer3 = new Lecturer("Meru Deeval", 1053, new Address("666 Hellish Ave.", "Hell", "HL66 6DV"), CurriculumType.Science, "666999666", true);
        System.out.println("------------------\n\n" + lecturer3.getPersonInfo() + "\n\n------------------");
    }
}

//JAVA HIERARCHY
//Package -> Class -> Data Members -> Methods -> (Sequence -> Selection -> Iteration)