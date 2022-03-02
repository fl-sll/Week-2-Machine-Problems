public class no11 {
    public static void main(String[] args){
        int x,y,temp;
        x = 5;
        y = 10;
        System.out.println("Before switch, the value of x is " + x + " and y is " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After switch, the value of x is " + x + " and y is " + y);
    }
}
