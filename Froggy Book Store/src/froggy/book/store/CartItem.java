package froggy.book.store;

public class CartItem 
{
    String itemPurchased;
    int qty;
    
    CartItem(String itemPurchased, int qty)
    {
        this.itemPurchased = itemPurchased;
        this.qty = qty;
    }

    public String getItemPurchased() 
    {
        return itemPurchased;
    }

    public int getQty() 
    {
        return qty;
    }
    
}
