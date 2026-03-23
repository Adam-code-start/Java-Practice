package java_programming_I.Part_2.part_22;
import java.util.Scanner;
public class FromOneToParameter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        printUntilNumber(Integer.valueOf(sc.nextLine()));
    }

    public static void printUntilNumber(int n)
    {
        for(int i=1; i<=n; i++)
        {
            System.out.println(i);
        }
    }
}
