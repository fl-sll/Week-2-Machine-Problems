import java.util.Scanner;

public class no14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer to be converted into hours minutes and seconds: ");
        int x = in.nextInt();

        int hours = x / 3600;
        int minutes = (x / 60) % 60;
        int secs = x % 60;

        System.out.println(hours + " hours " + minutes + " minutes " + secs + " seconds");
    }
}
