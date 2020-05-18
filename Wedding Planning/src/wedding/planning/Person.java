package wedding.planning;

public class Person 
{
    String fName = "";
    String lName = "";
    
    Person(String fName, String lName)
    {
        this.fName = fName;
        this.lName = lName;
    }
    public String getFName()
    {
        return fName;
    }
    
    public String getLName()
    {
        return lName;
    }
}
