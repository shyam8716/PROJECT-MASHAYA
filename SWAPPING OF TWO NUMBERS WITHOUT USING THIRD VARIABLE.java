import java.io.*;

class Swap {
    public static void main(String args[]) {
        int x = 5;
        int y = 55;
        System.out.println("Before swapping: " + x + " and " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: " + x + " and " + y);
    }
}