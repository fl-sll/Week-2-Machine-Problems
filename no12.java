import java.lang.Math;

public class no12 {
    public static void main(String[] args){
        int[] x = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : x) {
            System.out.print(i + " " + (int)Math.pow(i,2) + " " + (int)Math.pow(i,3));
            System.out.println();
        }
    }
}
