public class Convert{
    static double CelsiusToFahrenheit(double x)
    {
        return x * 1.8 + 32;
    }
    static double CelsiusToKelvin(double x)
    {
        return x +273.15;
    }
    static double KelvinToCelsius(double x)
    {
        return x -273.15;
    }
    static double KelvinToFahrenheit(double x)
    {
        return x * 1.8-459.67;
    }
    static double FahrenheitToCelsius(double x)
    {
        return (x -32)/1.8;
    }
    static double FahrenheitToKelvin(double x)
    {
        return (x+459.67)*5/9;
    }
    public static void main(String[] args) {
	System.out.println("25 degrees Celsius is:");
	System.out.println(CelsiusToKelvin(25)+" degrees Kelvin");
	System.out.println(CelsiusToFahrenheit(25)+" degrees Fahrenheit");
	System.out.println("100 degrees Fahrenheit is:");
	System.out.println(FahrenheitToCelsius(25)+" degrees Celsius");
	System.out.println(FahrenheitToKelvin(25)+" degrees Kelvib");
	System.out.println("0 degrees Kelvin is:");
	System.out.println(KelvinToCelsius(25)+" degrees Celsius");
	System.out.println(KelvinToFahrenheit(25)+" degrees Fahrenheit");
}

}
