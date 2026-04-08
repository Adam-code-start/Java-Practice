package java_programming_I.Part_3.part_30;
import java.util.Scanner;
public class PersonalDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String longest_name = "";
        int sum = 0, num = 0;
        while(true)
        {
            String info = sc.nextLine();
            if(info.equals(""))
            {
                break;
            }

            String[] split_info = info.split(",");
            if(longest_name.length() < split_info[0].length())
            {
                longest_name = split_info[0];
            }
            sum += Integer.valueOf(split_info[1]);
            num +=1;
        }
        System.out.println("Longest Name: " + longest_name);
        System.out.println("Average of the birth years: " + (double)sum/num);
    }
}
