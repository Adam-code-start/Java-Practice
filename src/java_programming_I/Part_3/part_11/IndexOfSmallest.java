package java_programming_I.Part_3.part_11;
import java.util.Scanner;
import java.util.ArrayList;
public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true)
        {
            int num = Integer.valueOf(sc.nextLine());
            if (num == 9999) {
                break;
            }
            numbers.add(num);
        }

        int min = numbers.get(0);
        for(int i=1; i<numbers.size(); i++)
        {
            if(min > numbers.get(i))
            {
                min = numbers.get(i);
            }
        }
        System.out.println("Smallest number: " + min);
        for(int i=0; i<numbers.size(); i++)
        {
            if(min == numbers.get(i))
            {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
