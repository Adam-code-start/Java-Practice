package java_programming_I.Part_1.part_13;
import java.util.Scanner;
public class DoubleInput {
    public static void main(String[] args)
    {
        System.out.println("Give a number:");
        Scanner scanner = new Scanner(System.in);
        double num = Double.valueOf(scanner.next());
        System.out.println("You gave the number " + num);
    }
}
