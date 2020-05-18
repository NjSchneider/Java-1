package talk.a.lot.cell.phone.company;

public class IncomingPhoneCall extends PhoneCall
{
    IncomingPhoneCall(String phoneNum)
    {
        super(phoneNum);
    }
    @Override
    public String getPhoneNumber()
    {
        return phoneNum;
    }
    @Override
    public void setPrice()
    {
        price = 0.02;
    }  

    @Override
    public double getCallPrice()
    {
        return price;
    }
    
    @Override
    public void displayCallInfo()
    {
        System.out.println("Incoming Phone Call");
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Call rate: " + price);        
        System.out.println("Price of call: " + price + "\n");
    }
}
