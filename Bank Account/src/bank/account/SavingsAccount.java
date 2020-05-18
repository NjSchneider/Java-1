package bank.account;

public class SavingsAccount extends Account
{
    static double interest = .0008;
        
    SavingsAccount(double accountBalance)
    {
        super(accountBalance);   
        calculateInterest();
    }
    
    public double calculateInterest()
    {
        interest = accountBalance * .0008;        
        return interest;
    }
    
    @Override
    public boolean credit()
    {
        accountBalance += interest;
        return creditSuccess;
    }
}
