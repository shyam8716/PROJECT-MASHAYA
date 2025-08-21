import java.io.*;
class Swap2 {
    public static void main(String args[]) {
        int x = 25;
        int y = 35;
        int temp;
        System.out.println("Before swapping: " + x + " and " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping: " + x + " and " + y);
    }
}