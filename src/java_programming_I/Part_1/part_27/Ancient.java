package java_programming_I.Part_1.part_27;
import java.util.Scanner;
public class Ancient {
    public static void main(String[] args)
    {
        System.out.println("Give an year:");
        Scanner scanner = new Scanner(System.in);
        int year = Integer.valueOf(scanner.nextLine());
        if(year<2015)
        {
            System.out.println("Ancient history!");
        }
    }
}
