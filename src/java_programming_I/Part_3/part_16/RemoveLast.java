package java_programming_I.Part_3.part_16;
import java.util.Scanner;
import java.util.ArrayList;
public class RemoveLast {
    public static void removeLast(ArrayList<String> strings)
    {
        if(strings.size()>0)
        strings.remove(strings.size()-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        while(true)
        {
            String string = sc.nextLine();
            if(string.equals(""))
            {
                break;
            }

            strings.add(string);
        }

        removeLast(strings);
        for(var x: strings)
        {
            System.out.println(x);
        }
    }
}
