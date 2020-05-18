package froggy.book.store;


public class Game extends Product
{
    private String rating;
    
    Game(String itemCode, String itemName,  String description, double price, String rating )
    {
        super(itemCode, itemName, price, description);
        this.rating = rating;        
    }

    public String getRating() 
    {
        return rating;
    }
    
}
