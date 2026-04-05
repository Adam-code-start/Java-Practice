package java_programming_I.Part_3.part_13;
import java.util.Scanner;
import java.util.ArrayList;
public class AverageOfAList {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true)
        {
            int num = Integer.valueOf(sc.nextLine());
            if(num == -1)
            {
                break;
            }

            numbers.add(num);
        }
        int sum=0;
        for(int i=0; i<numbers.size(); i++)
        {
            sum += numbers.get(i);
        }

        System.out.println("Average: " + ((double)sum/numbers.size()));
    }
}
