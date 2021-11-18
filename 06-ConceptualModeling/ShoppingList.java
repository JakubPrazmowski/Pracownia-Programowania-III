import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingList{
    private ArrayList<String> products = new ArrayList<String>();
    
    public void displayProducts(){
        System.out.println("List of Produts:");
        if (products.size()>0){
            for (int i = 0; i < products.size(); i++) {
                System.out.println(products.get(i));
            }
        }
        
    }
    public void displayNumberOfProducts(){
        System.out.println("Number of products to be purchased: "+ products.size());
    }
    public void addProduct(String product){
        products.add(product);
    }
    public void addProductFromKeyboard(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter one product to add to the list");
        String product = keyboard.nextLine();
        products.add(product);
    }
    public static void main(String[] args){
        ShoppingList shoppingList1= new ShoppingList();
        shoppingList1.displayProducts();
        shoppingList1.displayNumberOfProducts();
        shoppingList1.addProduct("Masło");
        shoppingList1.addProduct("Mąka");
        shoppingList1.addProduct("Chleb");
        shoppingList1.displayProducts();
        shoppingList1.displayNumberOfProducts();
        shoppingList1.addProduct("Mleko");
        shoppingList1.displayProducts();
        shoppingList1.displayNumberOfProducts();
        shoppingList1.addProductFromKeyboard();
        shoppingList1.displayProducts();
        shoppingList1.displayNumberOfProducts();
    }
}
