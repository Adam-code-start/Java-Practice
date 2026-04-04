package java_programming_I.Part_3.part_08;
import java.util.ArrayList;
import java.util.Scanner;
public class OnlyThese {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true)
        {
            int num = Integer.valueOf(sc.nextLine());
            if(num==-1)
            {
                break;
            }

            numbers.add(num);
        }
        System.out.print("From where?");
        int start = Integer.valueOf(sc.nextLine());
        System.out.print("To where?");
        int end = Integer.valueOf(sc.nextLine());

        for(int i=start; i<=end; i++)
        {
            System.out.println(numbers.get(i));
        }
    }
}
