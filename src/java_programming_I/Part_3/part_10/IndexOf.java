package java_programming_I.Part_3.part_10;
import java.util.Scanner;
import java.util.ArrayList;
public class IndexOf {
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

        System.out.print("Search for? ");
        int find_num = Integer.valueOf(sc.nextLine());
        for(int i=0; i<numbers.size(); i++)
        {
            if(numbers.get(i) == find_num)
            {
                System.out.println(numbers.get(i) + " is at index " + i);
            }
            else
            {
                continue;
            }
        }
    }
}
