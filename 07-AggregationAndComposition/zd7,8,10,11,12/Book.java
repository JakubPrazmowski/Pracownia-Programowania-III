import java.util.ArrayList;
public class Book{
    private String title;
    private Writer author;
    private String genre;
    private double cost;
    private ArrayList<Chapter> chapters;
    
    public Book(String title, Writer author, String genre, double cost, ArrayList<Chapter> chapters){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.cost=cost;
        this.chapters=chapters;
    }
    
    public String toString(){
        return "Author: [" + this.author.toString() +"]"+"\nTitle: "+this.title+"\nGenre: "+this.genre+"\nCost: "+this.cost+ "\nChapters: " + this.chapters.toString() +""; 
    }
    
    public static void main(String[] args){
        Writer w1= new Writer("Jan","Kowalski","Kraków, ul.Długa 99",38);
        Book b1 = new Book("Kamień", w1, "fantastyka", 999.99, new ArrayList<Chapter>(){{add(new Chapter("Pierwszy",25,1)); add(new Chapter("Drugi", 55,26)); add(new Chapter("Ostatni",50,81));}});
        System.out.println(b1);
    }
}