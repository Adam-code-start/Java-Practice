package java_programming_I.Part_3.part_24;
import java.util.Scanner;
public class LineByLine {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String string = sc.nextLine();
            if(string.equals(""))
            {
                break;
            }

            String[] split_string = string.split(" ");
            for(String x : split_string)
            {
                System.out.println(x);
            }
        }
    }
}
