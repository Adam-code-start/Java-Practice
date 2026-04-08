package java_programming_I.Part_3.part_28;
import java.util.Scanner;
public class AgeOfTheOldest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = -1;
        while(true)
        {
            String info = sc.nextLine();
            if(info.equals(""))
            {
                break;
            }
            String[] split_info = info.split(",");
            if(Integer.valueOf(split_info[1]) > age)
            {
                age = Integer.valueOf(split_info[1]);
            }
        }
        System.out.println("Age of the oldest: " + age);
    }
}
