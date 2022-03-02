import java.util.Scanner;
import java.lang.Math;

public class no10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter X1 = ");
        int x1 = in.nextInt();

        System.out.print("Enter X2 = ");
        int x2 = in.nextInt();

        System.out.print("Enter X3 = ");
        int x3 = in.nextInt();

        double mean = ((x1 + x2 + x3) / 3);

        double variance = (((Math.pow(x1-mean, 2)) + (Math.pow(x2-mean,2)) + (Math.pow(x3-mean,2))) / 3);

        double sdev = Math.sqrt(variance);

        System.out.println("Mean is " + String.format("%.2f", mean));
        System.out.println("Variance is " + String.format("%.2f", variance));
        System.out.println("Standard Deviation is " + String.format("%.2f", sdev));
    }
}
