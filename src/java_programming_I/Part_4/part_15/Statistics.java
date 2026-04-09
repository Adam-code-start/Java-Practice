package java_programming_I.Part_4.part_15;
import java.util.Scanner;
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        count = 0;
        sum = 0;
    }

    public void addNumber(int number) {
        // write code here
        sum+=number;
        count+=1;
    }

    public int getCount() {
        // write code here
        return count;
    }

    public int sum() {
        // write code here
        return sum;

    }

    public double average() {
        // write code here
        double avg = (double)sum/count;
        return avg;
    }

    public static void main(String[] args)
    {
        //Part 1: Count
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());

        //Part 2: Sum and Average
        Statistics statistics2 = new Statistics();
        statistics2.addNumber(3);
        statistics2.addNumber(5);
        statistics2.addNumber(1);
        statistics2.addNumber(2);
        System.out.println("Count: " + statistics2.getCount());
        System.out.println("Sum: " + statistics2.sum());
        System.out.println("Average: " + statistics2.average());

        //Part 3: Sum of User Input
        Statistics statistics3 = new Statistics();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        while(true)
        {
            int num = Integer.valueOf(sc.nextLine());
            if(num==-1)
            {
                break;
            }
            statistics3.addNumber(num);
        }
        System.out.println("Sum: " + statistics3.sum());

        //Part 4: Multiple Sums
        Statistics stats4_1 = new Statistics();
        Statistics stats4_2 = new Statistics();
        Statistics stats4_3 = new Statistics();
        System.out.println("Enter numbers:");
        while(true)
        {
            int num = Integer.valueOf(sc.nextLine());
            if(num==-1)
            {
                break;
            }
            stats4_1.addNumber(num);
            if(num%2==0)
            {
                stats4_2.addNumber(num);
            }
            else {
                stats4_3.addNumber(num);
            }
        }
        System.out.println("Sum: " + stats4_1.sum());
        System.out.println("Sum of even numbers: " + stats4_2.sum());
        System.out.println("Sum of odd numbers: " + stats4_3.sum());
    }
}
