public class Shoes{
    private String brand;
    private String name;
    private String size;
    private String colour;
    private int price;
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size=size;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public int Price(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public Shoes(String brand, String name, String size, String colour, int price){
        this.brand=brand;
        this.name=name;
        this.size=size;
        this.colour=colour;
        this.price=price;
    }
    public void display(){
        System.out.println("Brand: " + getBrand());
        System.out.println("Name: " + getName());                
        System.out.println("Size: " + getSize());        
        System.out.println("Colour: " + getColour());        
        System.out.println("Price: " + Price()+"zł");
    }
    public static void main(String[] args){
        Shoes shoes1 = new Shoes("Adidas", "Adidas Pro X 123 Series Y Extreme Mr.Bean Version",
        "35", "Zielony", 15999);
        shoes1.display();
    }
}
