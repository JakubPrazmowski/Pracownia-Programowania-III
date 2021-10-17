public class Rectangles{
    int Length;
    int Width;
    
    public void DisplayInfo(){
        System.out.println("Dimension: " + Length + "x" + Width);
        System.out.println("Perimeter: " + (Length+Width));
        System.out.println("Dimensions: " + (Length*Width));
    }
}
