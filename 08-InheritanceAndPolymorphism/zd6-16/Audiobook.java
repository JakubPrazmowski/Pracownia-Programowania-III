public class Audiobook extends Book{
    private int minutes;
    private int seconds;
    
    public Audiobook(String title, Writer author,Publisher publisher,int yearOfPublication, int minutes, int seconds){
        super(title,author,publisher,yearOfPublication);
        this.minutes=minutes;
        this.seconds=seconds;
    }
    
    public int getMinutes(){
        return minutes;
    }
    
    public int getSeconds(){
        return seconds;
    }
    
    public void setMinutes(int minutes){
        this.minutes=minutes;
    }
    
    public void setSeconds(int seconds){
        this.seconds=seconds;
    }
    
    public void display(){
        System.out.println("Title: "+ getTitle());
        System.out.println("Author: "+ this.getAuthor().getFirstName()+ " " + this.getAuthor().getLastName() + ", Literary genre: " +this.getAuthor().getLiteraryGenre());
        System.out.println("Publisher: " + this.getPublisher().getName() + ", city: " + this.getPublisher().getCity());
        System.out.println("Year of publication: "+ this.getYearOfPublication());
        System.out.println("Duration: "+ this.minutes+":"+this.seconds);
    }
    
    public static void main(String[] args){
        Publisher p1 = new Publisher("Książęczki u przyjaciela","Kraków");
        Publisher p2 = new Publisher("Konik","Warszawa");
        Writer w1 = new Writer("Jan", "Kowalski", "fantastyka");
        Writer w2 = new Writer("Piotr", "Nowak", "epika");
        Writer w3 = new Writer("Robert", "Ktoś", "liryka");
        Book b1 = new Book("Pierwszy", w1,p1,2018);
        Audiobook ab1 = new Audiobook("Drugi", w2,p2,2015, 55,54);
        Audiobook ab2 = new Audiobook("Trzeci", w3,p2,2014, 25,33);
        b1.display();
        ab1.display();
        ab2.display();
    }
}
