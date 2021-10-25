public class Clock{
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    Clock(){
        this.hour=00;
        this.minute=00;
    }
    Clock(int hour, int minute){
        this.hour=hour;
        this.minute=minute;
    }
    public void setClock(int Hour, int Minute){
        hour=Hour;
        minute=Minute;
    }
    public void setClock(){
        hour=00;
        minute=00;
    }
    public void displayTime(){
        System.out.println("Current time: " + hour + ":"+minute);
    }
    public void addOneMinute(){
        if (hour==23){
            if (minute==59){
                hour=00;
                minute=00;
                if (hour==alarmHour && minute==alarmMinute){
                    runAlarm();
                }
            }
            else{
                minute+=1;
                if (hour==alarmHour && minute==alarmMinute){
                    runAlarm();
                }
            }
        }
        else{
            if (minute==59){
                hour+=1;
                minute=00;
                if (hour==alarmHour && minute==alarmMinute){
                    runAlarm();
                }
            }
            else{
                minute+=1;
                if (hour==alarmHour && minute==alarmMinute){
                    runAlarm();
                }
            }
        }
    }
    public void setAlarm(int houR, int minutE){
        alarmHour=houR;
        alarmMinute=minutE;
    }
    public void runAlarm(){
        System.out.println("beep-beep-beep-beep !!");
    }
    public static void main(String[] args){
        Clock clock= new Clock(12,47);
        clock.displayTime();
        clock.setClock(18,14);
        clock.displayTime();
        clock.setClock(9,03);
        clock.displayTime();
        clock.setClock(23,58);
        clock.displayTime();
        clock.addOneMinute();
        clock.displayTime();
        clock.addOneMinute();
        clock.displayTime();
        clock.setClock(12,45);
        clock.displayTime();
        clock.setAlarm(12,46);
        clock.addOneMinute();
    }
        
}