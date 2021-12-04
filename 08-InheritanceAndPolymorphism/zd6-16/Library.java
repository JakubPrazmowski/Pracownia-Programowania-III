import java.util.ArrayList;
public class Library{
    private ArrayList<Book> books;
    
    Library(ArrayList<Book> books){
        this.books=books;
    }
    public void display(){
    System.out.println("Contents of the library:");
    System.out.println("========================");
        for (Book i : this.books) {
      i.display();
    }
    System.out.println("========================");
    }
    public static void main(String[] args){
        Publisher p1 = new Publisher("Książęczki u przyjaciela","Kraków");
        Publisher p2 = new Publisher("Konik","Warszawa");
        Publisher p3 = new Publisher("Kot i pies","Łódź");
        Writer w1 = new Writer("Jan", "Kowalski", "fantastyka");
        Writer w2 = new Writer("Piotr", "Nowak", "epika");
        Writer w3 = new Writer("Robert", "Ktoś", "liryka");
        Book b1 = new Book("Jeden", w1,p1,2018);
        Book eb1 = new Ebook("Drugi", w2,"drugi.txt",p2,2015);
        Book eb2 = new Ebook("Trzeci", w3, "trzeci.txt",p2,2002);
        Book ab1 = new Audiobook("Czwarty", w2,p3,2008, 55,54);
        Book ab2 = new Audiobook("Piąty", w1, p3,2007,25,33);
        b1.display();
        eb1.display();
        eb2.display();
        ab1.display();
        ab2.display();
        Library l1 = new Library(new ArrayList<Book>());
        l1.books.add(b1);
        l1.books.add(eb1);
        l1.books.add(eb2);
        l1.books.add(ab1);
        l1.books.add(ab2);
        l1.display();
    }
}
