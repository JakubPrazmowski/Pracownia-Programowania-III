public class Room{
    int number;
    int beds;
    boolean occupied;
    String guestName="";
    Room(int number){
        this.number=number;
        this.beds=2;
    }
    Room(int number, int beds){
        this.number=number;
        this.beds=beds;
    }
    public void checkin(String guestName){
        occupied=true;
        guestName=guestName;
    }
    public void checkout(){
        occupied=false;
        guestName="";
    }
    public void isOccupied(){
        System.out.println("Is occupied: "+occupied);
    }
    public void displayStatus(){
        System.out.println("Number: "+number);
        System.out.println("Beds: "+beds);
        System.out.println("Occupied: "+occupied);
        System.out.println("Guest name: "+guestName);
    }
    static void listOfRooms(Room[] rooms){
        for(int i = 0; i<rooms.length; i++) {
         rooms[i].displayStatus();
         System.out.println(" ");
      }
    }
    static void listOfRooms(Room[] rooms, int Beds){
        for(int i = 0; i<rooms.length; i++) {
            if (rooms[i].beds==Beds){
                rooms[i].displayStatus();
                System.out.println(" ");
            }
      }
    }
    static void vacantRooms(Room[] rooms){
        int x=0;
        int y=0;
        for(int i = 0; i<rooms.length; i++) {
            if (rooms[i].occupied==true){
                x+=1;
            }
            else{
                y+=1;
            }
      }
      System.out.println("Number of vacant rooms: "+y);
      System.out.println("Number of occupied rooms: "+x);
    }
    static void vacantBeds(Room[] rooms){
        int x=0;
        for(int i = 0; i<rooms.length; i++) {
            if (rooms[i].occupied==false){
                x+=rooms[i].beds;
            }
      }
      System.out.println("Number of vacant beds: "+x);
    }
    public static void main(String[] args){
        Room[] rooms = new Room[6];
        rooms[0] = new Room(1);
        rooms[1] = new Room(2);
        rooms[2] = new Room(3);
        rooms[3] = new Room(4,3);
        rooms[4] = new Room(5,3);
        rooms[5] = new Room(6,1);
        rooms[0].displayStatus();
        listOfRooms(rooms);
        listOfRooms(rooms, 2);
        vacantRooms(rooms);
        vacantBeds(rooms);
    }
}
