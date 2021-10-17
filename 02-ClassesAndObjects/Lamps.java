public class Lamps{
    String IsOn="off";
    public void SwitchOn(){
        IsOn="on";
    }
    public void SwitchOff(){
        IsOn="off";
    }
    public void DisplayInfo(){
        System.out.println("The lamp is " + IsOn);
    }
}
