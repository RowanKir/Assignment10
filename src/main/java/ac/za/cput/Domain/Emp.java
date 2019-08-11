package ac.za.cput.Domain;

public class Emp
{
    private String firstName, lastName, id;
    private int age;

    private Emp()
    {

    }

    private Emp(String firstName, String lastName, String id, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }




}
