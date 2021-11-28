import java.util.ArrayList;
public class Folder{
    private ArrayList<File> files;
    
    public Folder(ArrayList<File> files){
        this.files=files;
    }
    
    public String toString(){
        return "Folder contents: " + this.files;
    }
    
    public void addFile(File file){
        files.add(file);
    }
    
    public void removeFile(File file){
        files.remove(file);
    }
    
    public static void main(String[] args){
        Folder folder1 = new Folder(new ArrayList<File>());
        File file1 = new File("Notatka01", "text file", ".txt");
        File file2 = new File("Program01", "pyhon file", ".py");
        File file3 = new File("Notatka02", "text file", ".txt");
        folder1.addFile(file1);
        folder1.addFile(file2);
        System.out.println(folder1);
        folder1.addFile(file3);
        System.out.println(folder1);
        folder1.removeFile(file1);
        System.out.println(folder1);
    }
}
