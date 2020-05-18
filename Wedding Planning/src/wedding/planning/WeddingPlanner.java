package wedding.planning;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class WeddingPlanner 
{
    public static void main(String[] args)
    {        
        Scanner input = new Scanner(System.in);
               
        System.out.print("Name of the Bride: ");
        Person bride = new Person(input.next(), input.nextLine());        
        System.out.print("Name of the Groom: ");
        Person groom = new Person(input.next(), input.nextLine());
        
        Wedding weddingInfo = new Wedding(Couple.getGroomName(), Couple.getBrideName()); 
        System.out.print("Wedding Date: [yyyy mm dd");
        weddingInfo.date = input.nextLine();
        System.out.print("Wedding Location: ");
        weddingInfo.weddingLocal = input.nextLine();
        
        String guestName;
        while (true)
        {
            System.out.print("Guest Name: [enter 'quit' to stop]");
            Person guest = new Person(input.next(),input.nextLine());
            Guest.RSVP = Guest.getRSVP()
            Guest guest = new Guest(Person guest, RSVP);            
            Wedding.guestList.add(guest);
            
            if(input.equals("quit"))
            {
                break;
            }
            else
            {
                int count = Wedding.guestList.size();
            }
                
        }
        
        
    }
}


