package vowelorconsonent;
import java.util.Scanner;

public class VowelOrConsonent 
{

    public static void main(String[] args) 
    {        
        Scanner userInput = new Scanner(System.in);        
        System.out.print("Enter a letter: ");
        
        char userCharacter = userInput.nextLine().charAt(0); //Character entered by user  
        int userDecimal = (int)userCharacter; //Ascii decimal value for character entered
        
        //determines whether the character is a vowel based off its Ascii decimal value and prints statement that it is a vowel
        if (userDecimal == 65 || userDecimal == 97 || userDecimal == 69 || userDecimal == 101 || userDecimal == 73 || userDecimal == 105 || userDecimal == 79 || userDecimal == 111 || userDecimal == 85 || userDecimal == 117)
        {
            System.out.println(userCharacter + " is a vowel");
        }
        
        else
        {
            //Determines whether the character is an invalid input type (neither a vowel or consonant) and prints statement that it is invalid
            if (userDecimal < 65 || userDecimal > 90 && userDecimal < 97 || userDecimal > 122)
            {
                System.out.println(userCharacter + " is an invalid input");
            }
            //Determines whether the character is a consonant and prints statement that it is a consonant
            else
            {
                System.out.println(userCharacter + " is a consonant");
            }            
        }         
    }    
}
