import java.io.*;
class Stu {
    public static void main(String edc[]) {
        int maths = 5, statistics = 10, computers = 15, total;
        double average;
        total = maths + statistics + computers;
        average = total / 3.0;
        System.out.println("Maths marks: " + maths);
        System.out.println("Statistics marks: " + statistics);
        System.out.println("Computers marks: " + computers);
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
    }
}