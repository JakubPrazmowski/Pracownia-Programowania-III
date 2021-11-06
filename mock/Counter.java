public class Counter{
    int value=0;
    public void increase(){
        value+=1;
    }
    public void decrease(){
        value-=1;
    }
    public void increase(int n){
        value+=n;
    }
    public void decrease(int n){
        value-=n;
    }
    public int value(){
        return value;
    }
}