package java_programming_I.Part_2.part_02;
import java.util.Scanner;
public class SquareRootOfSum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.valueOf(sc.nextLine());
        int num2 = Integer.valueOf(sc.nextLine());
        int sum = num1 + num2;
        double sq_of_sum = Math.sqrt(sum);
        System.out.println(sq_of_sum);
    }
}
