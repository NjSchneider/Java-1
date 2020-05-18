package froggy.book.store;
import java.util.*;
import java.io.*;

public class FroggyBookStore 
{

    public static void main(String[] args) throws FileNotFoundException
    {
        ArrayList<Product> inventory = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        String answer = "0";
        
        System.out.println("WELCOME TO FROGGY'S BOOK STORE!");
        System.out.print("What is your name? ");
        answer = input.nextLine();
        Customer customer = new Customer(answer);
        
        System.out.println("\nHere is a list of items we have:\n");
        
        while(!answer.equals("N"))
        {
            System.out.println("\tGames Available");
            File gFile = new File("Games.txt");
            Scanner readGFile = new Scanner(gFile);
            
            while(readGFile.hasNext())
            {
                String data = readGFile.next();
                String[] thing = data.split(",");
                String itemCode = thing[0];
                String itemName = thing[1];
                double price = Double.parseDouble(thing[2]);
                String description = thing[3];
                String rating = thing[4];
                inventory.add(new Game(itemCode, itemName, description, price, rating));                
            }
            for(Product inStock : inventory)
            {
                displayList(inStock);
            }
            
            System.out.println("\tBooks Available");
            File bFile = new File("Books.txt");
            Scanner readBFile = new Scanner(bFile);  
            
            while(readBFile.hasNext())
            {
                String data = readBFile.next();
                String[] thing = data.split(",");
                String itemCode = thing[0];
                String itemName = thing[1];                
                String description = thing[3];
                double price = Double.parseDouble(thing[2]);
                String author  = thing[4];                
                inventory.add(new Book(itemCode, itemName, description, price, author));                
            } 
            for(Product inStock : inventory)
            {
                displayList(inStock);
            }

            System.out.println("Which would you like? ");
            String itemPurchased = input.nextLine();
            System.out.print("You chose " + itemPurchased + ". How many would you like? ");
            int qty = input.nextInt();                      
            input.nextLine();
            
            customer.shoppingCart.add(new CartItem(itemPurchased, qty));
            
            System.out.print("Would you like to ad another item? Y or N ");
            answer = input.nextLine();            
        }        
        File file = new File("Receipt");
        
        if(!file.exists())
        {
            PrintWriter pw = new PrintWriter("Receipt");
            pw.println("Thank you " + customer.getName() + "for your purchase at Froggy's Book and Game Store\n");
            pw.println("Qty\t Item\t Price\t Total\t\n");
            for(int i = 0; i < customer.shoppingCart.size(); i++)
            {
                pw.println(CartItem.getQty() + "\t " + Product.getItemName() + "\t " + Product.getPrice() + "\t " + customer.qtyTotal);
            }
            pw.println("Sub Total: " + customer.getSubTotal() + "\n");
            pw.println("Tax: " + customer.getTax() + "\n");
            pw.println("Total: " + customer.getCartTotal());
                                
            pw.close();        
        }
    }
    public static void displayList(Product product)
        {
            product.display();
        }   
}
