import java.util.ArrayList;
public class Bookcase{
    private ArrayList<Book> books;
    
    public void placeBook(Book book){
        books.add(book);
    }
    
    public void removeBook(Book book){
        books.remove(book);
    }
    
    public Bookcase(ArrayList<Book> books){
        this.books=books;
    }
    
    public void displayContent(){
        System.out.println("Bookcase content: ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Book number " + i+":");
            System.out.println(books.get(i));
        }
    }
    
    public static void main(String[] args){
        Writer w1= new Writer("Jan","Kowalski","Kraków, ul.Długa 99",38);
        Book b1 = new Book("Kamień", w1, "fantastyka", 999.99, new ArrayList<Chapter>(){{add(new Chapter("Pierwszy",25,1)); add(new Chapter("Drugi", 55,26)); add(new Chapter("Ostatni",50,81));}});
        Book b2 = new Book("Papier", w1, "romans", 599.99, new ArrayList<Chapter>(){{add(new Chapter("Początek",45,1)); add(new Chapter("Koniec", 40,46));}});
        Bookcase bc1 = new Bookcase(new ArrayList<Book>(){{add(b1); add(b2);}});
        bc1.displayContent();
        bc1.removeBook(b1);
        bc1.displayContent();
        Writer w2= new Writer("Piotr","Nowak","Warszawa, ul.Krótka 29",29);
        Book b3 = new Book("Kartka", w2, "dramat", 99.99, new ArrayList<Chapter>(){{add(new Chapter("Pustka",28,1)); add(new Chapter("Zapełnienie", 40,29));}});
        bc1.placeBook(b3);
        bc1.displayContent();

    }
}
