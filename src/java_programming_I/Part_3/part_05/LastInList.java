package java_programming_I.Part_3.part_05;
import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;
public class LastInList {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while(true)
        {
            String name = sc.nextLine();
            if(name.equals(""))
            {
                break;
            }

            names.add(name);
        }

        System.out.println(names.get(names.size() - 1));
    }
}
