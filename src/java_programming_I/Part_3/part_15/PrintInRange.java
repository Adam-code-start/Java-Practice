package java_programming_I.Part_3.part_15;
import java.util.Scanner;
import java.util.ArrayList;
public class PrintInRange {
    public static void printNumbersInRange(ArrayList<Integer> numbers, int start, int end)
    {
        System.out.println("The numbers in the range [" + start + ", " + end + "]");
        for(var x : numbers)
        {
            if(x>=start&&x<=end)
            {
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
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
        System.out.print("Enter the lower limit of Range: ");
        int start = Integer.valueOf(sc.nextLine());
        System.out.print("Enter the upper limit of Range: ");
        int end = Integer.valueOf(sc.nextLine());
        printNumbersInRange(numbers, start, end);
    }
}
