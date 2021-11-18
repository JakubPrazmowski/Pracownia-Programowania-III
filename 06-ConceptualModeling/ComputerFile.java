public class ComputerFile{
    private String name;
    private double size;
    private String format;
    private String createDate;
    private boolean isOpen;
    private String content;
    
    public void displayFile(){
        System.out.println(content);
    }
    public void displayProperties(){
        System.out.println("Name: " + name);
        System.out.println("Size: " + size+"KB");
        System.out.println("Format: " + format);
        System.out.println("Date of creation: " + createDate);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void openFile(){
        this.isOpen=true;
    }
    public void closeFile(){
        this.isOpen=false;
    }
    ComputerFile(String name, double size, String format, String createDate){
        this.name=name;
        this.size=size;
        this.format=format;
        this.createDate=createDate;
        this.isOpen=false;
        this.content="";
    }
    public static void main(String[] args) {
        ComputerFile computerFile1 = new ComputerFile("ComputerFile.drawio", 5.07, "png", "15.11.2021");
        computerFile1.displayProperties();
    }
}
