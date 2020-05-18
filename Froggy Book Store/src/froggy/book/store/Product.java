package froggy.book.store;
import java.util.*;

public class Product 
{
    private String itemCode;
    private String itemName;
    private double price;
    private String description;    
    
    Product(String itemCode, String itemName, double price, String description)
    {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.description = description;         
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemCode() 
    {
        return itemCode;
    }

    public String getItemName() 
    {
        return itemName;
    }

    public double getPrice() 
    {
        return price;
    }

    public String getDescription() 
    {
        return description;
    }
    
    public void display()
    {
        System.out.println(getItemCode() + " " + getItemCode());
    }
}

