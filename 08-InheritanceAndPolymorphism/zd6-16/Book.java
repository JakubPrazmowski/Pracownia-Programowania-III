public class Book{
    private String title;
    private Writer author;
    private Publisher publisher;
    private int yearOfPublication;
    
    public Book(String title, Writer author, Publisher publisher,int yearOfPublication){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.yearOfPublication=yearOfPublication;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public Writer getAuthor(){
        return this.author;
    }
    
    public void setAuthor(Writer author){
        this.author=author;
    }
    
    public Publisher getPublisher(){
        return this.publisher;
    }
    
    public void setPublisher(Publisher publisher){
        this.publisher=publisher;
    }
    
    public int getYearOfPublication(){
        return this.yearOfPublication;
    }
    
    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication=yearOfPublication;
    }
    
    public void display(){
        System.out.println("Title: "+ this.title);
        System.out.println("Author: "+ this.author.getFirstName() + " " + this.author.getLastName() + ", Literary genre: " +this.author.getLiteraryGenre());
        System.out.println("Publisher: " + this.publisher.getName() + ", city: " + this.publisher.getCity());
        System.out.println("Year of publication: "+ this.yearOfPublication);
    }
    
    public static void main(String[] args){
        Publisher p1 = new Publisher("Książęczki u przyjaciela","Kraków");
        Writer w1 = new Writer("Jan", "Kowalski", "fantastyka");
        Writer w2 = new Writer("Piotr", "Nowak", "epika");
        Book b1 = new Book("Jeden", w1,p1,2015);
        Book b2 = new Book("Dwa", w2,p1,2018);
        b1.display();
        b2.display();
    }
}
