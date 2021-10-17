public class Counters{
    int Value = 0;
    public void IncreaseBy1(){
        Value += 1;
    }
    public void DecreaseBy1(){
        Value -= 1;
    }
    public void IncreaseBy10(){
        Value = Value + 10;
    }
    public void DecreaseBy10(){
        Value -= 10;
    }
    public void Reset(){
        Value = 0;
    }
}
