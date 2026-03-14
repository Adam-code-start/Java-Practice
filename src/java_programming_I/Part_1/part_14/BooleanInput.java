package java_programming_I.Part_1.part_14;
import java.util.Scanner;
public class BooleanInput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write something:");
        boolean message = Boolean.valueOf(sc.nextLine());
        System.out.println("True or false? "+message);
    }
}
