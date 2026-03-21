package java_programming_I.Part_2.part_10;
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while(true)
        {
            System.out.println("Give a number:");
            num = Integer.valueOf(sc.nextLine());
            if(num == 0)
            {
                break;
            }
            else
            {
                sum +=num;
                continue;
            }
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
