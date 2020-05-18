package wedding.planning;

public class Couple 
{ 
    String groomName;
    String brideName;
    Couple(Person bride, Person groom)
    {
        groomName = groom.fName + " " + groom.lName;
        brideName = bride.fName + " " + bride.lName;
               
    }
     
    public String getGroomName()
    {        
        return groomName;
    }
    
    public String getBrideName()
    {        
        return brideName;
    }
}
