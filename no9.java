import java.util.Scanner;

public class no9 {
    public static void main(String[] Strings) {
    
        Scanner in = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = in.nextFloat();
   
        double celsius =( 5 *(fahrenheit - 32.0)) / 9.0;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + String.format("%.2f", celsius) + " degree Celsius");
    } 
}

