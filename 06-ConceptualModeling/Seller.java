public class Seller{
    private String name;
    private String typeOfSeller;
    
    public void sell(String product, double price){
        System.out.println(typeOfSeller+" "+name+ " sold " + product+ " for "+ price + " zł.");
    }
    public void displayInfo(){
        System.out.println("Type of seller: "+ typeOfSeller);
        System.out.println("Name: "+ name);
    }
    public Seller(String name, String typeOfSeller){
        this.name=name;
        this.typeOfSeller=typeOfSeller;
    }
    public static void main(String[] args){
        Seller seller1= new Seller("Ikea","Company");
        seller1.displayInfo();
        seller1.sell("table", 159.99);
    }
}
