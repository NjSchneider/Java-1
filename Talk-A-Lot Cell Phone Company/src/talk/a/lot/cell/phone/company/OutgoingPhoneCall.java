package talk.a.lot.cell.phone.company;

public class OutgoingPhoneCall extends PhoneCall 
{
    double time;
    double totalPrice;
    OutgoingPhoneCall(String phoneNum, double time)
    {        
        super(phoneNum);
        this.time = time;
    }
    @Override
    public String getPhoneNumber()
    {
        return phoneNum;
    }
    @Override
    public void setPrice()
    {
        price = 0.04;
    }  

    @Override
    public double getCallPrice()
    {
        return totalPrice = price * time;
    }
    
    @Override
    public void displayCallInfo()
    {
        System.out.println("Outgoing Phone Call");
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Rate per minute: " + price);
        System.out.println("Call time: " + time + " minutes");
        System.out.println("Price of call: " + getCallPrice() + "\n");
    }
}
