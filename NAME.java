import java.util.*;
class Name {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter your full name:");
        name = sc.nextLine();  // reads entire line
        System.out.println("My name is: " + name);
    }
}