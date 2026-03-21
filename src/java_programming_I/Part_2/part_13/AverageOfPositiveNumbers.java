package java_programming_I.Part_2.part_13;
import java.util.Scanner;
public class AverageOfPositiveNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int count_positive = 0, sum = 0;
        while(true)
        {
            num = Integer.valueOf(sc.nextLine());
            if(num == 0)
            {
                break;
            }
            else
            {
                if(num>0)
                {
                    count_positive +=1;
                    sum += num;
                }
                continue;
            }
        }

        if(count_positive == 0)
        {
            System.out.println("Cannot calculate the average");
        }
        else
        {
            System.out.println((double)sum/count_positive);
        }
    }
}
