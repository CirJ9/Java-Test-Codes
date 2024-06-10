package Trial1;

import java.util.Scanner;
public class TemperatureConverter {
    
    public static double TemperatureConverter(double celcius) {
        return (celcius * 9/5) + 32;
    }
    
    public static double CelciustoFaranheit(double faranheit){
        return (faranheit - 32) * 5/9;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           System.out.println("Enter value in Celcius");
           
        double celcius = input.nextDouble();
        double faranheit = CelciustoFaranheit(celcius);
      System.out.println(celcius + " celsius is equal to " + faranheit + "faranheit");  
    }
}