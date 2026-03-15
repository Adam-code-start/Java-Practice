package java_programming_I.Part_2.part_01;
import java.util.Scanner;
public class Squared {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        int square_of_num = num * num;
        System.out.println(square_of_num);
    }
}
