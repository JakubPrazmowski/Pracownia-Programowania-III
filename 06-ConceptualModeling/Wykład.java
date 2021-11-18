public class Wykład{
    private String przedmiot;
    private int liczbaGodzin;
    private String wykładowca;
    
    public String getPrzedmiot(){
        return przedmiot;
    }
    
    public void setPrzedmiot(String przedmiot){
        this.przedmiot=przedmiot;
    }
    
    public int getLiczbaGodzin(){
        return liczbaGodzin;
    }
    
    public void setLiczbaGodzin(int liczbaGodzin){
        this.liczbaGodzin=liczbaGodzin;
    }
    
    public String getWykładowca(){
        return wykładowca;
    }
    
    public void setWykładowca(String wykładowca){
        this.wykładowca=wykładowca;
    }
    
    public void displayInfo(){
        System.out.println("Przedmiot: "+ getPrzedmiot());
        System.out.println("Liczba godzin: "+ getLiczbaGodzin());
        System.out.println("Wykładowca: "+ getWykładowca());
    }
    
    public Wykład(String przedmiot, int liczbaGodzin, String wykładowca){
        this.przedmiot=przedmiot;
        this.liczbaGodzin=liczbaGodzin;
        this.wykładowca=wykładowca;
    }
    
    public static void main(String[] args){
        Wykład wykład1= new Wykład("Informatyka", 30, "dr. hab. Jan Kowalski");
        wykład1.displayInfo();
    }
}
