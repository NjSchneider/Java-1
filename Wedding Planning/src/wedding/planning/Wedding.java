package wedding.planning;
import java.time.LocalDate;
import java.util.ArrayList;

public class Wedding 
{
    LocalDate weddingDate;
    String weddingLocal;
    String date;
    private String coupleName;
    
    ArrayList<Guest> guestList = new ArrayList<>();
    
    Wedding(String groomName, String brideName)
    {
        weddingDate = LocalDate.parse(date);
        coupleName = brideName +" "+groomName;
    }
    
    public String getCoupleName()
    { 
        return coupleName; 
    }
    
    public void printWedding()
    {
        System.out.printf("Detail's of " + getCoupleName() +" Wedding");
        System.out.println("The wedding will be held at " + weddingLocal);
        System.out.println(weddingDate);
        
        for (int i = 0; i < guestList.size(); i++)
        {
            System.out.println(guestList[i] + " RSVP'd: " + Guest.getRSVP());
        }
        
    }
}
