public class Customer{
    private String name;
    private String surname;
    
    public void buy(String product, double price){
        System.out.println(name+" "+surname+ " bought " + product+ " for "+ price + " zł.");
    }
    public void displayInfo(){
        System.out.println("Customer's name: "+ name);
        System.out.println("Customer's surname: "+ surname);
    }
    public Customer(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
    public static void main(String[] args){
        Customer customer1= new Customer("Jan","Kowalski");
        customer1.displayInfo();
        customer1.buy("table", 159.99);
    }
}
