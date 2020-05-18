package talk.a.lot.cell.phone.company;

public abstract class PhoneCall 
{
    String phoneNum;
    double price;
    PhoneCall(String phoneNum)
    {
        this.phoneNum = phoneNum;
        setPrice();
    }
    
    public void setPrice()
    {
        price = 0.0;
    }
    
    public abstract String getPhoneNumber();
    
    public abstract double getCallPrice();
    
    public abstract void displayCallInfo();

}
