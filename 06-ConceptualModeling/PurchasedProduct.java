public class PurchasedProduct{
    private String name;
    private String productID;
    private String dateOfPurchase;
    private double price;
    private int quantity;
    private String purchaseID;
    
    public double finalPrice(){
        return price*quantity;
    }
    
    public void displayInfo(){
        System.out.println("Product name: "+name);
        System.out.println("Product Id: "+productID);
        System.out.println("Date of purchase: "+dateOfPurchase);
        System.out.println("Price of one pice: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Purchase Id: "+purchaseID);
        System.out.println("Final price: "+finalPrice());
    }
    
    public PurchasedProduct(String name, String productID, String dateOfPurchase, double price, int quantity, String purchaseID){
        this.name=name;
        this.productID=productID;
        this.dateOfPurchase=dateOfPurchase;
        this.price=price;
        this.quantity=quantity;
        this.purchaseID=purchaseID;
    }
    
    public static void main(String[] args){
        PurchasedProduct purchasedProduct1= new PurchasedProduct("Table","563525","11.18.2021", 159.99, 2, "532532");
        purchasedProduct1.displayInfo();
    }
}
