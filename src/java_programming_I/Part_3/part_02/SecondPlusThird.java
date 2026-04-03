package java_programming_I.Part_3.part_02;
import java.util.ArrayList;
import java.util.Scanner;
public class SecondPlusThird {
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int num = Integer.valueOf(sc.nextLine());
            if(num == 0)
            {
                break;
            }

            numbers.add(num);
        }

        System.out.println(numbers.get(1) + numbers.get(2));
    }
}
