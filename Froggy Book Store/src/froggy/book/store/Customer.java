package froggy.book.store;
import java.io.*;
import java.util.*;

public class Customer 
{
    double qtyTotal = 0;
    double subTotal = 0;
    double tax = 0;
    double cartTotal = 0;
    
    private String name;
    ArrayList<CartItem> shoppingCart = new ArrayList<CartItem>();
    
    Customer(String name)
    {
        this.name = name;
    }    
    
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    
    public double getQtyTotal()
    {
        return qtyTotal = CartItem.getQty() * Product.getPrice();
    }
    
    public double getSubTotal()
    {
        for(int i = 0; i < shoppingCart.size(); i ++)
        {
            subTotal = qtyTotal; 
        }
        return subTotal;
    }
    
    public double getTax()
    {        
        return tax = .076 * subTotal;
    }
    
    public double getCartTotal()
    {        
        return cartTotal = subTotal + tax;
    }

}
