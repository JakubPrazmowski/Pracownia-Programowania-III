public class File{
    private String name;
    private String type;
    private String extension;
    
    public File(String name, String type, String extension){
        this.name=name;
        this.type=type;
        this.extension=extension;
    }
    
    public String toString(){
        return "\nName: "+this.name+"\nType: "+this.type+"\nExtension: "+this.extension;
    }
}
