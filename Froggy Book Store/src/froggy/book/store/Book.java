package froggy.book.store;


public class Book extends Product
{
    private String author;
    
    Book(String itemCode, String itemName, String description, double price, String author)
    {
        super(itemCode, itemName, price, description);
        this.author = author;          
    }

    public String getAuthor() 
    {
        return author;
    }
    
}
