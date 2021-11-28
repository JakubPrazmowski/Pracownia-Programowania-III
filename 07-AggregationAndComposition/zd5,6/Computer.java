public class Computer{
    private Processor CPU;
    private String owner;
    private boolean isOn;
    
    public Computer(Processor CPU, String owner, boolean isOn){
        this.CPU=CPU;
        this.owner=owner;
        this.isOn=isOn;
    }
    
    public void turnOn(){
        this.isOn=true;
    }
    
    public String toString(){
        return "CPU: [" + this.CPU.toString() +"]"+"\nOwner: "+this.owner+"\nIs on: "+this.isOn;
    }
    
    public static void main(String[] args){
        Computer c1 = new Computer(new Processor("intel core i5", 1.6, 4),"Jan Kowalski", false);
        System.out.println(c1);
        c1.turnOn();
        System.out.println(c1);
        System.out.println(c1.CPU);
    }
}
