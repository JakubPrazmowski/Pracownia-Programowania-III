public class InternetDevice
{
    String name;
    boolean connected;
    static int connectedDevices=0;
    public InternetDevice(String name){
        this.name=name;
        this.connected=false;
    }
    public void connect(){
        connected=true;
        connectedDevices+=1;
    }
    public void disconnect(){
        connected=false;
        connectedDevices-=1;
    }
    public void isConnected(){
        System.out.println("Is connected: "+connected);
    }
    public void displayStatus(){
        System.out.println("Name: "+ name);
        isConnected();
        
    }
    static void displayConnections(){
        System.out.println("Number of devices connected to the Internet : "+connectedDevices);
    }
    public void setConnected(boolean connected){
        if (this.connected==false){
            if (connected==true){
                this.connected=connected;
                connectedDevices+=1;
            }
        }else{
            if (connected==false){
                this.connected=connected;
                connectedDevices-=1;
            }
        }
    }
        
    public static void main(String[] args) {
    InternetDevice device1 = new InternetDevice("personal computer");
    InternetDevice device2 = new InternetDevice("laptop");
    InternetDevice device3 = new InternetDevice("tablet");
    InternetDevice device4 = new InternetDevice("smartphone");
    InternetDevice device5 = new InternetDevice("TV");
    device1.connect();
    device3.connect();
    device4.connect();
    device1.displayStatus();
    device2.displayStatus();
    device3.displayStatus();
    device4.displayStatus();
    device5.displayStatus();
    displayConnections();
  }
}
