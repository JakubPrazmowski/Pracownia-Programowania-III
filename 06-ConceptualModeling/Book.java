public class Book{
    private String name;
    private int numberOfCopies;
    private String author;
    private String genre;
    
    public Book(String name, int numberOfCopies, String author, String genre){
        this.name=name;
        this.numberOfCopies=numberOfCopies;
        this.author=author;
        this.genre=genre;
    }
    public void displayInfo(){
        System.out.println("Name of the book: "+ name);
        System.out.println("Author: "+ author);
        System.out.println("Number of copies: "+ numberOfCopies);
        System.out.println("Genre: "+ genre);
    }
}
