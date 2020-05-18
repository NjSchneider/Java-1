package bank.account;
import java.util.Scanner;
import java.util.ArrayList;

public class BankAccount 
{
    
    public static void main(String[] args) 
    {      
        Scanner input = new Scanner(System.in);
        ArrayList<Account> bank = new ArrayList<>();
        
        String answer = "0";
        
        while(!answer.equals("Q"))
        {
            System.out.println("\nWhat type of account would you like to enter?");
            System.out.println("Enter 'S' for Savings, 'C' for checking, or 'Q' to quit");
            answer = input.nextLine();
            
            if(answer.equals("S"))
            {
               System.out.print("Initial balance: ");
               bank.add(new SavingsAccount(input.nextDouble())); 
               input.nextLine();
            }
            if(answer.equals("C"))
            {
               System.out.print("Initial balance: ");
               bank.add(new CheckingAccount(input.nextDouble()));
               input.nextLine();               
            }
            if(answer.equals("Q"))
            {
                for(int i = 0; i <bank.size(); i++)
                {
                    System.out.printf("Account Balance: ", bank.get(i));
                }
            }
        }
                
    }
           
    
}
