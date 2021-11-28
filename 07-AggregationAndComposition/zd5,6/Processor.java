public class Processor{
    private String modelName;
    private double clocking;
    private int amountOfCores;
    
    public Processor(String modelName, double clocking, int amountOfCores){
        this.modelName=modelName;
        this.clocking=clocking;
        this.amountOfCores=amountOfCores;
    }
    
    public String toString(){
        return "\nModel name: "+this.modelName+"\nClocking: "+this.clocking+"\nAmount of cores: "+this.amountOfCores; 
    }
}
