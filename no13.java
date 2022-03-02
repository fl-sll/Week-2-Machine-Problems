import java.lang.Math;
import java.util.Scanner;

public class no13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter coefficient of x^2: ");
        double a = in.nextDouble();

        System.out.print("Enter coefficient of x: ");
        double b = in.nextDouble();

        System.out.print("Enter coefficient of c: ");
        double c = in.nextDouble();

        double d = Math.pow(b,2) - 4*a*c;

        double x1 = ((-b + Math.sqrt(d)) / (2*a));
        double x2 = ((-b - Math.sqrt(d)) / (2*a));

        System.out.println("Values of X are " + String.format("%.2f",x1) + " and " + String.format("%.2f",x2));

    }
}
