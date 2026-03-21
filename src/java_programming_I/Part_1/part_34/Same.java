package java_programming_I.Part_1.part_34;
import java.util.Scanner;
public class Same {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String first = sc.nextLine();
        System.out.println("Enter the second string:");
        String second = sc.nextLine();
        if(first.equals(second))
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Different");
        }
    }

}
