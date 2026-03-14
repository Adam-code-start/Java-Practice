package java_programming_I.Part_1.part_08;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
    }
}
