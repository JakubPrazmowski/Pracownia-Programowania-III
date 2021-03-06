public class BasicStatistics
{
    
    static int NumberOfItems(int x,int y)
    {
        int z=0;
        for (int i=x; i<=y; i+=1){
            z+=1;
        }
        return z;
    }
    static int SumOfNumbers(int x,int y)
    {
        int z=0;
        for (int i=x; i<=y; i+=1){
            z+=i;
        }
        return z;
    }
    static double ArithmeticMean(int x,int y)
    {
        return SumOfNumbers(x,y)/(double)NumberOfItems(x,y);
    }
    public static void main(String[] args) {
	System.out.println("Basic statistics for integers in the range <5,10> :");
	System.out.println("Number of items: " + NumberOfItems(5,10));
	System.out.println("Sum: " + SumOfNumbers(5,10));
	System.out.println("ArithmeticMean: " + ArithmeticMean(5,10));
	}

}
