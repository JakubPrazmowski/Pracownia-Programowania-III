public class Product{
    private String productName;
    private boolean isVegetarian;
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public boolean getIsVegetarian(){
        return isVegetarian;
    }
    public void setIsVegetarian(boolean isVegetarian){
        this.isVegetarian=isVegetarian;
    }
    public Product(){
        this.productName="";
        this.isVegetarian=false;
    }
    public static void main(String[] args){
        Product product1 = new Product();
        product1.setProductName("Jabłko");
        product1.setIsVegetarian(true);
        System.out.println("Product name: "+product1.getProductName());
        System.out.println("Is vegetarian: "+product1.getIsVegetarian());
    }
}
