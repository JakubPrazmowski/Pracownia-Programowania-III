public class Ebook extends Book {
    private String fileName;
    
    public Ebook(String title, Writer author, String fileName, Publisher publisher, int yearOfPublication){
        super(title, author,publisher, yearOfPublication);
        this.fileName=fileName;
    }
    
    public String getFileName(){
        return this.fileName;
    }
    
    public void setFileName(String fileName){
        this.fileName=fileName;
    }
    
    public void display(){
        System.out.println("Title: "+ getTitle());
        System.out.println("Author: "+ this.getAuthor().getFirstName()+ " " + this.getAuthor().getLastName() + ", Literary genre: " +this.getAuthor().getLiteraryGenre());
        System.out.println("Publisher: " + this.getPublisher().getName() + ", city: " + this.getPublisher().getCity());
        System.out.println("Year of publication: "+ this.getYearOfPublication());
        System.out.println("File name: "+ this.fileName);
    }
    
    public static void main(String[] args){
        Publisher p1 = new Publisher("Książęczki u przyjaciela","Kraków");
        Publisher p2 = new Publisher("Konik","Warszawa");
        Writer w1 = new Writer("Jan", "Kowalski", "fantastyka");
        Writer w2 = new Writer("Piotr", "Nowak", "epika");
        Writer w3 = new Writer("Robert", "Ktoś", "liryka");
        Book b1 = new Book("Pierwszy", w1, p1,2018);
        Ebook eb1 = new Ebook("Drugi", w2,"drugi.txt",p2,2009);
        Ebook eb2 = new Ebook("Trzeci", w3,"trzeci.txt",p2,2011);
        b1.display();
        eb1.display();
        eb2.display();
        
    }
}
