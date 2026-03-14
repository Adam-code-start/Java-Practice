package java_programming_I.Part_1.part_15;
import java.util.Scanner;
public class TypesOfInput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a string:");
        String message = sc.nextLine();
        System.out.println("Give an integer:");
        int num = sc.nextInt();
        System.out.println("Give a double:");
        double num1 = sc.nextDouble();
        System.out.println("Give a boolean:");
        boolean value = sc.nextBoolean();
        System.out.println("You gave the string "+message);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double :" + num1);
        System.out.println("You gave the boolean " + value);
    }
}
