package bank.account;

public class CheckingAccount extends Account
{
    static double fee = 1.35;
    
    CheckingAccount(double accountBalance)
    {
        super(accountBalance);                
    }
    
    @Override
    public boolean credit()
    {
        if(creditSuccess = true)
        {
            accountBalance -= fee;            
        }
        return creditSuccess;        
    }
    
    @Override
    public boolean debit()
    {        
        if(debitSuccess = true)
        {
            accountBalance -= fee;            
        }
        return debitSuccess;
    }
}
