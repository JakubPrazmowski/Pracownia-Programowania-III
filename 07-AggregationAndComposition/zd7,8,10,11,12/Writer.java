public class Writer{
    private String name;
    private String surname;
    private String address;
    private int age;
    
    public Writer(String name, String surname, String address, int age){
        this.name=name;
        this.surname=surname;
        this.address=address;
        this.age=age;
    }
    
    public void writeBook(){
    }
    
    public String toString(){
        return "\nName: "+this.name+"\nSurname: "+this.surname+"\nAddress: "+this.address+"\nAge: "+this.age;
    }
}
