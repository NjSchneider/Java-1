package pkg99.bottles.of.beer;

public class BottlesOfBeer 
{

    public static void main(String[] args) 
    {
        int beer = 99; //number of bottles of beer
        String term = "bottles"; //correct usage of bottle (plurality)
        
        while(beer > 0)
        {
            if(beer > 1)
            {
                term = "bottles";
                System.out.println(beer + " " + term + " of beer on the wall, " + beer + " " + term + " of beer.");
                beer--;
                System.out.println("Take one down, pass it around, " + beer + " " + term + " of beer on the wall.");
           
            }
            else
            {
                term = "bottle";
                System.out.println(beer + " " + term +" of beer on the wall, " + beer + " " + term + " of beer.");
                beer--;
                System.out.println("Take it Down, pass it around, no more bottles of beer on the wall.");
            }
        }   
        
    }
    
}
