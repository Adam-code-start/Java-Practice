package java_programming_I.Part_2.part_32;
import java.util.ArrayList;
import java.util.Scanner;
public class StarSign {
    public static void printStars(int number)
    {
        for(int i=0; i<number; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printSquare(int size)
    {
        for(int i=0; i<size; i++)
        {
            printStars(size);
        }
    }
    public static void printRectangle(int height, int width)
    {
        for(int i=0; i<height; i++)
        {
            printStars(width);
        }
    }
    public static void printTriangle(int size)
    {
        for(int i=0; i<size; i++)
        {
            printStars(i+1);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the number of stars to print: ");
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true)
        {
            int num = Integer.valueOf(sc.nextLine());
            if(num <= 0)
            {
                break;
            }
            numbers.add(num);
        }
        //Part 1
        for(int i=0; i<numbers.size(); i++)
        {
            printStars(numbers.get(i));
        }
        System.out.println();
        //Part 2
        for(int x : numbers)
        {
            printSquare(x);
        }
        System.out.println();
        //Part 3
        boolean added = false;
        if(numbers.size()%2!=0)
        {
            numbers.add(numbers.get(0));
            added = true;
        }
        for(int i=0; i<numbers.size()-1; i++)
        {
            printRectangle(numbers.get(i), numbers.get(i+1));
        }
        System.out.println();
        //Part 4
        if(added)
        {
            numbers.remove(numbers.size()-1);
        }
        for(int x : numbers)
        {
            printTriangle(x);
        }
    }
}
