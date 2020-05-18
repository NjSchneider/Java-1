package talk.a.lot.cell.phone.company;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoPhoneCall 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<PhoneCall> testPhoneCall = new ArrayList<>();
        
        String input = "0";
        while(!input.equals("Q"))
        {
            System.out.println("Hello. What kind of phone call would you like to input?");
            System.out.println("'I' for Incoming phone call or 'O' for Outgoing phone call or 'Q' to Quit");
            input = sc.nextLine();
            
            if(input.equals("I"))
            {
                System.out.println("Please enter Phone Number");
                testPhoneCall.add(new IncomingPhoneCall(sc.nextLine()));
            }
            else if(input.equals("O"))
            {
                System.out.println("Please enter Phone Number (press ENTER) then enter time in Minutes");
                testPhoneCall.add(new OutgoingPhoneCall(sc.nextLine(), sc.nextDouble()));
                sc.nextLine();
            }
            else if(input.equals("Q"))
            {
                for(PhoneCall pc : testPhoneCall)
                {
                    display(pc);
                }
            }
        }
    }
    
    public static void display(PhoneCall phoneCall)
    {
        phoneCall.displayCallInfo();
    }
}
