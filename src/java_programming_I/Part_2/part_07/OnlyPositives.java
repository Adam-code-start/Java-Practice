package java_programming_I.Part_2.part_07;
import java.util.Scanner;
public class OnlyPositives {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Give a number:");
            num = Integer.valueOf(sc.nextLine());
            if(num<0)
            {
                System.out.println("Unsuitable number");

            }
            else if(num == 0)
            {
                break;
            }
            else // num>0
            {
                System.out.println(num*num);
            }
        }
        while(true);
    }
}
