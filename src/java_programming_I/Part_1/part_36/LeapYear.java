package java_programming_I.Part_1.part_36;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args)
    {
        int year = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Give an year: ");
        year = Integer.valueOf(sc.nextLine());
        if((year%4==0 && year%100!=0)||(year%400==0))
        {
            System.out.println("The year is a leap year.");
        }
        else
        {
            System.out.println("The year is not a leap year.");
        }
    }
}
